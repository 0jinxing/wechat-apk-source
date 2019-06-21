package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.mm.storage.ac.a;

final class SightSettingsUI$b
{
  public String oDt;
  String[] oDu;
  int[] oDv;
  ac.a oDw;

  public SightSettingsUI$b(SightSettingsUI paramSightSettingsUI, String paramString, ac.a parama, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.oDt = paramString;
    this.oDu = paramArrayOfString;
    this.oDw = parama;
    this.oDv = paramArrayOfInt;
  }

  final String zc(int paramInt)
  {
    int i = 0;
    if (i < this.oDv.length)
      if ((paramInt != this.oDv[i]) || (i >= this.oDu.length));
    for (String str = this.oDu[i]; ; str = this.oDu[0])
    {
      return str;
      i++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightSettingsUI.b
 * JD-Core Version:    0.6.2
 */