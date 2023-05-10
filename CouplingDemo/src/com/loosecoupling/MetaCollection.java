package com.loosecoupling;

import java.util.List;

public class MetaCollection {
    private FetchMetadata fetchMetadata;
    private ExportMetadata exportMetadata;
    public MetaCollection(FetchMetadata fetchMetadata, ExportMetadata exportMetadata) {
        this.fetchMetadata = fetchMetadata;
        this.exportMetadata = exportMetadata;
    }
    public void collectMetadata() {
        List<Object> metadata = fetchMetadata.fetchMetadata();
        exportMetadata.export(metadata);
    }

    public static void main(String[] args) {
    	MetaCollection  meta=new MetaCollection(new XMLFetch(), new CSVExport());
    	meta.collectMetadata();
    	
    	MetaCollection  meta1=new MetaCollection(new JSONFetch(), new PDFExport());
    	meta1.collectMetadata();
    }
}
