package com.loosecoupling;

import java.io.File;
import java.util.List;

public interface ExportMetadata {
    File export(List<Object> metadata);
}
