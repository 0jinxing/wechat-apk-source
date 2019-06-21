package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class TalkRoomVolumeMeter$a extends SurfaceView
  implements SurfaceHolder.Callback
{
  Paint aFY;
  int max;
  private float[] positions;
  private float sAa;
  float sAb;
  PaintFlagsDrawFilter sAc;
  boolean sAd;
  boolean started;
  float szP;
  float szQ;
  SurfaceHolder szR;
  Bitmap szS;
  Bitmap szT;
  private Bitmap szU;
  Rect szV;
  int szW;
  int szX;
  ap szY;
  private boolean szZ;
  int value;

  public TalkRoomVolumeMeter$a(TalkRoomVolumeMeter paramTalkRoomVolumeMeter, Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(25960);
    this.max = 100;
    this.value = 0;
    this.szP = 0.0F;
    this.szQ = 0.0F;
    this.szZ = false;
    this.sAa = this.szQ;
    this.sAb = this.szQ;
    this.sAd = false;
    this.started = false;
    this.szR = getHolder();
    this.szR.addCallback(this);
    this.aFY = new Paint();
    this.aFY.setAntiAlias(true);
    this.sAc = new PaintFlagsDrawFilter(0, 3);
    this.szY = new ap(new TalkRoomVolumeMeter.a.1(this), true);
    AppMethodBeat.o(25960);
  }

  private int cEM()
  {
    AppMethodBeat.i(25962);
    int i;
    if (this.szS == null)
    {
      i = 190;
      AppMethodBeat.o(25962);
    }
    while (true)
    {
      return i;
      i = this.szS.getHeight();
      AppMethodBeat.o(25962);
    }
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(25963);
    ab.v("MicroMsg.TalkRoomVoiceMeter", "surfaceChanged, width = " + paramInt2 + " height = " + paramInt3);
    this.szQ = 0.0F;
    this.szP = (paramInt3 - cEM());
    this.sAa = this.szQ;
    this.sAb = this.szQ;
    this.szX = paramInt2;
    this.szW = cEM();
    this.szV = new Rect(0, (int)this.sAa, this.szX, (int)this.sAa + this.szW);
    this.szZ = true;
    AppMethodBeat.o(25963);
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(25961);
    ab.v("MicroMsg.TalkRoomVoiceMeter", "surfaceCreated");
    this.szS = BitmapFactory.decodeResource(getResources(), 2130840412);
    this.szU = BitmapFactory.decodeResource(getResources(), 2130840411);
    this.szT = BitmapFactory.decodeResource(getResources(), 2130840413);
    AppMethodBeat.o(25961);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(25964);
    ab.v("MicroMsg.TalkRoomVoiceMeter", "surfaceDestroyed");
    this.szZ = false;
    this.szY.stopTimer();
    if (this.szS != null)
    {
      ab.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", new Object[] { this.szS.toString() });
      this.szS.recycle();
      this.szS = null;
    }
    if (this.szU != null)
    {
      ab.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", new Object[] { this.szU.toString() });
      this.szU.recycle();
      this.szU = null;
    }
    if (this.szT != null)
    {
      ab.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", new Object[] { this.szT.toString() });
      this.szT.recycle();
      this.szT = null;
    }
    AppMethodBeat.o(25964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter.a
 * JD-Core Version:    0.6.2
 */