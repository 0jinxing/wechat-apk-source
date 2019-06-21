package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandSmileyGrid extends GridView
{
  AdapterView.OnItemClickListener arw;
  int jiA;
  int jiB;
  private c jir;
  AppBrandSmileyGrid.a jiv;
  int jiw;
  int jix;
  int jiy;
  int jiz;

  public AppBrandSmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134311);
    this.jix = 0;
    this.jiz = 0;
    this.jiA = 0;
    this.jiB = 0;
    this.arw = new AppBrandSmileyGrid.1(this);
    AppMethodBeat.o(134311);
  }

  int getRowSpacing()
  {
    return this.jiz;
  }

  public void setPanelManager(c paramc)
  {
    this.jir = paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyGrid
 * JD-Core Version:    0.6.2
 */