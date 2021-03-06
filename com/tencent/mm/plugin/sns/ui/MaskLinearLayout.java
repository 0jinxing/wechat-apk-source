package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class MaskLinearLayout extends LinearLayout
{
  private boolean enable;
  private List<MaskImageView> list;
  private ak rgT;
  private Runnable rgU;

  public MaskLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38316);
    this.enable = false;
    this.list = new LinkedList();
    this.rgT = new ak();
    this.rgU = new MaskLinearLayout.1(this);
    super.setOnTouchListener(new MaskLinearLayout.2(this));
    AppMethodBeat.o(38316);
  }

  public final void b(MaskImageView paramMaskImageView)
  {
    AppMethodBeat.i(38317);
    this.list.add(paramMaskImageView);
    AppMethodBeat.o(38317);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(38318);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(38318);
  }

  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(38319);
    Assert.assertTrue(false);
    AppMethodBeat.o(38319);
  }

  public void settouchEnable(boolean paramBoolean)
  {
    this.enable = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.MaskLinearLayout
 * JD-Core Version:    0.6.2
 */