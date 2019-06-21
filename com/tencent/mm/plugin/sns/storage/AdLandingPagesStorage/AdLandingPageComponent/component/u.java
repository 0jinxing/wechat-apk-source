package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.vfs.e;
import org.json.JSONException;
import org.json.JSONObject;

public final class u extends h
  implements SensorEventListener
{
  Sensor accelerometer;
  private SensorManager bCW;
  Sensor bGE;
  ImageView cAw;
  ProgressBar progressBar;
  int rbs;
  final float rbt = 10.0F;
  final int rbu = 1;
  HorizontalScrollView rbv;
  float[] rbw;
  float[] rbx;
  private int rby = 0;
  boolean rbz = true;

  public u(Context paramContext, m paramm, ViewGroup paramViewGroup)
  {
    super(paramContext, paramm, paramViewGroup);
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(37256);
    boolean bool;
    if (!super.al(paramJSONObject))
    {
      AppMethodBeat.o(37256);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramJSONObject.put("swipeCount", this.rby);
        if (!this.rbz)
        {
          String str = ag.ck(((m)this.qZo).qWD);
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("urlMd5", str);
          localJSONObject.put("needDownload", 1);
          paramJSONObject.put("imgUrlInfo", localJSONObject);
        }
        AppMethodBeat.o(37256);
        bool = true;
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(37256);
        bool = false;
      }
    }
  }

  public final void cpa()
  {
    AppMethodBeat.i(37254);
    super.cpa();
    this.bCW.registerListener(this, this.accelerometer, 1);
    this.bCW.registerListener(this, this.bGE, 1);
    AppMethodBeat.o(37254);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37255);
    super.cpb();
    this.bCW.unregisterListener(this);
    AppMethodBeat.o(37255);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37248);
    View localView = this.contentView;
    this.bCW = ((SensorManager)this.context.getSystemService("sensor"));
    this.accelerometer = this.bCW.getDefaultSensor(1);
    this.bGE = this.bCW.getDefaultSensor(2);
    this.rbv = ((HorizontalScrollView)localView.findViewById(2131827622));
    this.cAw = ((ImageView)localView.findViewById(2131827623));
    this.progressBar = ((ProgressBar)localView.findViewById(2131821219));
    this.progressBar.setVisibility(8);
    AppMethodBeat.o(37248);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37249);
    if (!e.ct(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.gj("adId", ((m)this.qZo).qWD)))
      this.rbz = false;
    String str = ((m)this.qZo).qWD;
    Bitmap localBitmap = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.gm("adId", str);
    if (localBitmap != null)
    {
      ab.i("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "loaded cached image with  ".concat(String.valueOf(str)));
      setImage(localBitmap);
      AppMethodBeat.o(37249);
    }
    while (true)
    {
      return;
      startLoading();
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(str, ((m)this.qZo).qWP, new u.1(this));
      AppMethodBeat.o(37249);
    }
  }

  public final boolean cpx()
  {
    AppMethodBeat.i(37253);
    boolean bool;
    if (cpw() >= (int)(getView().getHeight() * 0.1F))
    {
      bool = true;
      AppMethodBeat.o(37253);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37253);
    }
  }

  protected final int getLayout()
  {
    return 2130970717;
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f1 = -10.0F;
    AppMethodBeat.i(37252);
    if (paramSensorEvent.sensor.getType() == 1)
      this.rbw = paramSensorEvent.values;
    if (paramSensorEvent.sensor.getType() == 2)
      this.rbx = paramSensorEvent.values;
    float f3;
    if ((this.rbw != null) && (this.rbx != null))
    {
      paramSensorEvent = new float[9];
      if (SensorManager.getRotationMatrix(paramSensorEvent, new float[9], this.rbw, this.rbx))
      {
        float[] arrayOfFloat = new float[3];
        SensorManager.getOrientation(paramSensorEvent, arrayOfFloat);
        float f2 = arrayOfFloat[2];
        if (this.rbs != 0)
        {
          f3 = f2;
          if (f2 > 10.0F)
            f3 = 10.0F;
          if (f3 >= -10.0F)
            break label163;
          f3 = f1;
        }
      }
    }
    label163: 
    while (true)
    {
      f3 = f3 * this.rbs / 10.0F;
      this.rbv.scrollBy((int)f3, 0);
      AppMethodBeat.o(37252);
      return;
    }
  }

  public final void setImage(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37251);
    if (paramBitmap == null)
    {
      ab.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp is null!");
      AppMethodBeat.o(37251);
    }
    while (true)
    {
      return;
      if (this.cAw == null)
      {
        ab.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the imageView is null!");
        AppMethodBeat.o(37251);
      }
      else
      {
        if (paramBitmap.getHeight() != 0)
          break;
        ab.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp.getHeight is 0!");
        AppMethodBeat.o(37251);
      }
    }
    this.progressBar.setVisibility(8);
    this.cAw.setImageBitmap(paramBitmap);
    this.cAw.post(new u.2(this));
    int i;
    if (paramBitmap.getHeight() != 0)
    {
      i = this.iev;
      if (((m)this.qZo).qWV == 2.147484E+009F)
        break label182;
      i = (int)((m)this.qZo).qWV;
    }
    label182: 
    while (true)
    {
      this.cAw.setLayoutParams(new RelativeLayout.LayoutParams(paramBitmap.getWidth() * i / paramBitmap.getHeight(), i));
      AppMethodBeat.o(37251);
      break;
    }
  }

  public final void startLoading()
  {
    AppMethodBeat.i(37250);
    this.progressBar.setVisibility(0);
    AppMethodBeat.o(37250);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u
 * JD-Core Version:    0.6.2
 */