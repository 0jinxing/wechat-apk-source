package com.tencent.mm.pluginsdk.ui.tools;

import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

final class AppChooserUI$c
{
  boolean nue;
  boolean sKP;
  ResolveInfo vtC;
  CharSequence vtD;
  Drawable vtE;
  boolean vtF;
  boolean vtG;

  public AppChooserUI$c(AppChooserUI paramAppChooserUI)
  {
  }

  public AppChooserUI$c(AppChooserUI paramAppChooserUI, ResolveInfo paramResolveInfo, CharSequence paramCharSequence)
  {
    this.vtC = paramResolveInfo;
    this.vtD = paramCharSequence;
    this.vtF = false;
    this.sKP = true;
    this.vtG = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.c
 * JD-Core Version:    0.6.2
 */