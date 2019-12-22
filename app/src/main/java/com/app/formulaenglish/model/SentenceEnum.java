package com.app.formulaenglish.model;

public enum SentenceEnum {
    SENTENCE_0(1, "Công thức thì",
            "Hiện tại đơn, hiện tại tiếp diễn, hiện tại hoàn thành, hiện tại hoàn thành tiếp diễn..",
            new String[]{"Hiện tại đơn", "Hiện tại tiếp diễn", "Hiện tại hoàn thành", "Hiện tại hoàn thành tiếp diễn", "Quá khứ đơn",
                    "Quá khứ tiếp diễn", "Quá khứ hoàn thành", "Quá khứ hoàn thành tiếp diễn", "Tương lai đơn", "Tương lai tiếp diễn",
                    "Tương lai hoàn thành tiếp diễn"},
            null,
            new String[]{"thi_hientaidon", "thi_hientaitiepdien", "thi_hientaihoanthanh", "thi_hientaihoanthanhtiepdien", "thi_quakhudon",
                    "thi_quakhutiepdien", "thi_quakhuhoanthanh", "thi_quakhuhoanthanhtiepdien", "thi_tuonglaidon", "thi_tuonglaitiepdien",
                    "thi_tuonglaihoanthanhtiepdien"}),

    SENTENCE_1(1, "Câu điều kiện",
            "Câu điều kiện loại 1, loại 2, loại 3, đảo ngữ và dạng đặc biệt",
            new String[]{"Câu điều kiện loại 1", "Câu điều kiện loại 2", "Câu điều kiện loại 3",
                    "Đảo ngữ của câu điều kiện", "Dạng đặc biệt của câu điều kiện"},
            null,
            new String[]{"dieukien_loaimot", "dieukien_loaihai", "dieukien_loaiba", "dieukien_daongu", "dieukien_dacbiet"}),

    SENTENCE_2(1, "Câu bị động",
            "Cấu trúc ngữ pháp, các trường hợp đặc biệt",
            new String[]{"Cấu trúc ngữ pháp", "Các trường hợp đặc biệt"},
            null,
            new String[]{"bidong_cautrucnguphap", "bidong_dacbiet"}),

    SENTENCE_3(0, "Câu gián tiếp",
            "Câu trực tiếp, câu gián tiếp, cách tường thuật từ câu trực tiếp sang câu nói gián tiếp",
            null,
            "caugiantiep",
            null),

    SENTENCE_4(1, "Câu ước",
            "Câu ước loại 1, loại 2, loại 3",
            new String[]{"Câu ước loại 1 (Tương lai)", "Câu ước loại 2 (Hiện tại)", "Câu ước loại 3 (Quá khứ)"},
            null,
            new String[]{"cauuoc_loaimot", "cauuoc_loaihai", "cauuoc_loaiba"}),

    SENTENCE_5(1, "Câu so sánh",
            "So sánh bằng, hơn, nhất, kép, gấp nhiều lần..",
            new String[]{"So sánh bằng", "So sánh hơn", "So sánh nhất", "So sánh kép", "So sánh gấp nhiều lần", "Bảng so sánh tính từ, trạng từ bất quy tắc"},
            null,
            new String[]{"sosanh_bang", "sosanh_hon", "sosanh_nhat", "sosanh_kep", "sosanh_gapnhieulan", "sosanh_bangsosanh"}),

    SENTENCE_6(1, "Câu hỏi đuôi",
            "Công thức và dạng đặc biệt",
            new String[]{"Công thức câu hỏi đuôi", "Dạng đặc biệt của câu hỏi đuôi"},
            null,
            new String[]{"cauhoiduoi_congthuc", "cauhoiduoi_dacbiet"}),

    SENTENCE_7(0, "Câu mệnh lệnh",
            "Câu mệnh lệnh trực tiếp, gián tiếp, dạng phủ định..",
            null,
            "caumenhlenh",
            null),

    SENTENCE_8(0, "Câu chẻ",
            "Câu chẻ,nhấn mạnh chủ ngữ, tân ngữ..",
            null,
            "cauche",
            null),

    SENTENCE_9(0, "Câu cảm thán",
            "Câu cảm thán, với What, How, So và Much, dạng phủ định",
            null,
            "caucamthan",
            null),

    SENTENCE_10(0, "Câu đảo ngữ",
            "Đảo ngữ với No, Not, Only..",
            null,
            "caudaongu",
            null),

    SENTENCE_11(0, "Câu đồng tình",
            "Câu đồng tình với các trạng từ",
            null,
            "caudongtinh",
            null),
    SENTENCE_12(1, "Mệnh đề quan hệ",
            "Đại từ quan hệ và trạng từ quan hệ, rút gọn mệnh đề và lược bỏ đại từ quan hệ",
            new String[]{"Đại từ quan hệ và trạng từ quan hệ", "Rút gọn mệnh đề và lược bỏ đại từ quan hệ"},
            null,
            new String[]{"menhdequanhe_daituquanhe", "menhdequanhe_rutgonmenhde"}),

    SENTENCE_13(0, "Công thức viết lại câu",
            "Công thức viết lại câu cho nhiều trường hợp",
            null,
            "congthucvietlaicau",
            null),

    SENTENCE_14(0, "Cấu trúc trật tự tính từ",
            "Tính từ về màu sắc, chỉ kích cỡ, chiều dài, chiều cao..",
            null,
            "trattutinhtu",
            null),

    SENTENCE_15(0, "Thành ngữ tục ngữ",
            "Thành ngữ tục ngữ dân gian",
            null,
            "thanhngutucngu",
            null),

    SENTENCE_16(0, "Bảng động từ bất quy tắc",
            "Bảng động từ bất quy tắc",
            null,
            "dongtubatquytac",
            null),

    SENTENCE_17(2, "Dịch từ online",
            "Dịch từ online",
            null,
            "https://translate.google.com/",
            null);


    private int type;
    private String title;
    private String description;
    private String[] childSentence;
    private String fileName;
    private String[] fileNameChild;

    SentenceEnum(int type, String title, String description, String[] childSentence, String fileName, String[] fileNameChild) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.childSentence = childSentence;
        this.fileName = fileName;
        this.fileNameChild = fileNameChild;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getType() {
        return type;
    }

    public String[] getChildSentence() {
        return childSentence;
    }

    public String getFileName() {
        return fileName;
    }

    public String[] getFileNameChild() {
        return fileNameChild;
    }
}
