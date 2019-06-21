package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class aj
{
  public String cwT;
  public int position;
  public boolean qFG = false;
  public a qzM;
  public ImageView raP;
  public TextView raQ;
  public TimeLineObject rnr;
  public View rns;
  public View rnt;
  public MMPinProgressBtn rnu;
  public TextView rnv;
  public boolean rnw = false;
  public int rnx = 0;

  public final void a(TimeLineObject paramTimeLineObject, int paramInt, String paramString, boolean paramBoolean)
  {
    this.rnr = paramTimeLineObject;
    this.position = paramInt;
    this.cwT = paramString;
    this.qFG = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.aj
 * JD-Core Version:    0.6.2
 */