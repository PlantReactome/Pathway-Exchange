#!/bin/bash

file1=$1
file2=$2
outputPrefix=$3
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"

cat $file1 $file2 | grep -v main > ${outputPrefix}_curated_gene_export_prioritize_all_raw.tab

awk '{print $2,"\t",$3}' ${outputPrefix}_curated_gene_export_prioritize_all_raw.tab | sed "s/\.1//g" | sed "s/UniProt://g" | sort | uniq > ${outputPrefix}_prioritize_all_clean_sort_uniq.tab

awk '{print $2}' ./${outputPrefix}_prioritize_all_clean_sort_uniq.tab | sort | uniq > ./LOC_RGPs_${outputPrefix}_expanded_sort_uniq.txt

awk {'print $2'} ${outputPrefix}_prioritize_all_clean_sort_uniq.tab | sort | uniq -d > ${outputPrefix}_locus_dupes.txt

awk {'print $2,"\t",$1}' ${outputPrefix}_prioritize_all_clean_sort_uniq.tab | sort | uniq | grep -f ${outputPrefix}_locus_dupes.txt > ${outputPrefix}_locus_dupes.txt.corr

awk {'print $2,"\t",$1}' ${outputPrefix}_prioritize_all_clean_sort_uniq.tab | sort | uniq > os_loc_2_os_uniprot_rice_${outputPrefix}_manual_with_dupes.txt

cat os_loc_2_os_uniprot_rice_${outputPrefix}_manual_with_dupes.txt | grep -v -f $DIR/../resources/RGP_dupes_list.lst > os_loc_2_os_uniprot_rice_${outputPrefix}_no_dupes.txt

echo "The following IDs still have duplicate entries"

cat os_loc_2_os_uniprot_rice_${outputPrefix}_no_dupes.txt | awk -F "\t" '{print $1}' | sort | uniq -d 
