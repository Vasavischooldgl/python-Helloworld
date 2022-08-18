anh.setFadeOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                anh.setPanelState(PanelState.COLLAPSED);
            }
        });anh.setFadeOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                anh.setPanelState(PanelState.COLLAPSED);
            }
        });android.graphics.drawable.GradientDrawable CTVSUB= new android.graphics.drawable.GradientDrawable();
CTVSUB.setCornerRadius(40);
CTVSUB.setColor(Color.parseColor("#FF000000")); 
imageview1.setBackground(CTVSUB);
imageview1.setClipToOutline(true);
