package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

public class TalkRoomVolumeMeter extends FrameLayout
{
  private TalkRoomVolumeMeter.a szK;
  private ImageView szL;
  private ImageView szM;
  private ImageView szN;
  private FrameLayout szO;

  public TalkRoomVolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(25967);
    initView();
    AppMethodBeat.o(25967);
  }

  public TalkRoomVolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25966);
    initView();
    AppMethodBeat.o(25966);
  }

  private void initView()
  {
    AppMethodBeat.i(25968);
    this.szK = new TalkRoomVolumeMeter.a(this, getContext());
    this.szL = new ImageView(getContext());
    this.szL.setScaleType(ImageView.ScaleType.FIT_XY);
    this.szL.setImageResource(2130840415);
    this.szL.setVisibility(0);
    this.szM = new ImageView(getContext());
    this.szM.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.szM.setImageResource(2130840414);
    this.szM.setVisibility(8);
    this.szN = new ImageView(getContext());
    this.szN.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.szN.setImageResource(2130840411);
    this.szN.setVisibility(8);
    this.szO = new FrameLayout(getContext());
    this.szO.addView(this.szK);
    this.szO.addView(this.szM);
    this.szO.setVisibility(8);
    addView(this.szO);
    addView(this.szN);
    addView(this.szL);
    setBackgroundColor(-16777216);
    bringChildToFront(this.szL);
    AppMethodBeat.o(25968);
  }

  private void setShowErr(boolean paramBoolean)
  {
    AppMethodBeat.i(25969);
    ImageView localImageView = this.szN;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      AppMethodBeat.o(25969);
      return;
    }
  }

  private void setShowRed(boolean paramBoolean)
  {
    this.szK.sAd = paramBoolean;
  }

  public void setMax(int paramInt)
  {
    this.szK.max = paramInt;
  }

  public void setMaxPos(int paramInt)
  {
    this.szK.szQ = paramInt;
  }

  public void setMinPos(int paramInt)
  {
    this.szK.szP = paramInt;
  }

  public void setShowFlame(boolean paramBoolean)
  {
    AppMethodBeat.i(25970);
    Object localObject = this.szO;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      ((FrameLayout)localObject).setVisibility(i);
      if (!paramBoolean)
        break;
      localObject = this.szK;
      if (!((TalkRoomVolumeMeter.a)localObject).started)
      {
        ((TalkRoomVolumeMeter.a)localObject).started = true;
        ((TalkRoomVolumeMeter.a)localObject).szY.ae(100L, 100L);
      }
      AppMethodBeat.o(25970);
      return;
    }
    TalkRoomVolumeMeter.a locala = this.szK;
    if (locala.started)
    {
      locala.started = false;
      if ((locala.sAb >= locala.szP) && (locala.sAb <= locala.szQ))
        break label134;
    }
    label134: Canvas localCanvas;
    do
    {
      do
      {
        locala.szY.stopTimer();
        AppMethodBeat.o(25970);
        break;
      }
      while ((locala.szT == null) || (locala.szS == null));
      localCanvas = locala.szR.lockCanvas();
    }
    while ((localCanvas == null) || (locala.szV == null));
    localCanvas.setDrawFilter(locala.sAc);
    locala.szV.set(0, 0, locala.szX, locala.szW + 0);
    if (locala.sAd);
    for (localObject = locala.szT; ; localObject = locala.szS)
    {
      localCanvas.drawBitmap((Bitmap)localObject, null, locala.szV, locala.aFY);
      locala.szR.unlockCanvasAndPost(localCanvas);
      break;
    }
  }

  public void setValue(int paramInt)
  {
    TalkRoomVolumeMeter.a locala = this.szK;
    int i;
    if (paramInt < 0)
      i = 0;
    while (true)
    {
      locala.value = i;
      locala.sAb = (locala.szQ - (locala.szQ - locala.szP) * (locala.value * 1.0F / locala.max));
      return;
      i = paramInt;
      if (paramInt > locala.max)
        i = locala.max;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter
 * JD-Core Version:    0.6.2
 */