package com.tencent.mm.plugin.qqmail.ui;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$c extends MailAddrsViewControl.c
{
  private ImageView pxl;
  private int tag;

  public ComposeUI$c(ComposeUI paramComposeUI, ImageView paramImageView, int paramInt)
  {
    this.pxl = paramImageView;
    this.tag = paramInt;
  }

  public final void jW(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(68212);
    ComposeUI.y(this.pwY);
    Object localObject;
    if (this.pwY.pwD)
      localObject = this.pxl;
    while (true)
    {
      ((ImageView)localObject).setVisibility(i);
      if (((this.tag == 1) || (this.tag == 2)) && (!paramBoolean))
        ComposeUI.z(this.pwY).postDelayed(new ComposeUI.c.1(this), 10L);
      AppMethodBeat.o(68212);
      return;
      ImageView localImageView = this.pxl;
      localObject = localImageView;
      if (!paramBoolean)
      {
        i = 4;
        localObject = localImageView;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.c
 * JD-Core Version:    0.6.2
 */