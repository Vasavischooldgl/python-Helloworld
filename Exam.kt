top.addPanelSlideListener(new PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                if (top != null) {
            if (top.getPanelState() == PanelState.EXPANDED) {
bottom_bar.setElevation((float)6);
linear7.setElevation((float)6);
imageview17.setElevation((float)6);
              
            } else {
bottom_bar.setElevation((float)0);
linear7.setElevation((float)0);
imageview17.setElevation((float)0);
}    }      }
            
			    @Override
            public void onPanelStateChanged(View panel, PanelState previousState, PanelState newState) {
                
            }
        });
