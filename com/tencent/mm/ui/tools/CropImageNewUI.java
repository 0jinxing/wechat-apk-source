package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.plugin.gif.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.vfs.e;
import java.lang.reflect.Field;
import java.util.Timer;
import junit.framework.Assert;

public class CropImageNewUI extends MMActivity
{
  private int emC = 0;
  private String filePath;
  private final int zAP = 1;
  private final int zAQ = 0;
  private int zAR;
  private int zAS = 0;
  private FilterImageView zAT;
  private LinearLayout zAU;
  private CropImageView zAV;
  private ImageView zAW;
  private View zAX;
  private int zAY = 0;
  private boolean zAZ = false;
  private boolean zBa = false;
  private boolean zBb = false;

  private static Bitmap a(float[][] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, CropImageView paramCropImageView)
  {
    AppMethodBeat.i(34852);
    if (paramCropImageView == null)
    {
      paramArrayOfFloat = null;
      AppMethodBeat.o(34852);
      return paramArrayOfFloat;
    }
    float[] arrayOfFloat = l.c(paramArrayOfFloat, new float[] { paramFloat1, paramFloat2, 1.0F });
    paramArrayOfFloat = l.c(paramArrayOfFloat, new float[] { paramFloat3, paramFloat4, 1.0F });
    int i = (int)Math.min(arrayOfFloat[0], paramArrayOfFloat[0]);
    int j = (int)Math.min(arrayOfFloat[1], paramArrayOfFloat[1]);
    int k = i;
    if (i < 0)
      k = 0;
    i = j;
    if (j < 0)
      i = 0;
    int m = (int)Math.abs(arrayOfFloat[0] - paramArrayOfFloat[0]);
    int n = (int)Math.abs(arrayOfFloat[1] - paramArrayOfFloat[1]);
    paramArrayOfFloat = new Matrix();
    switch (paramCropImageView.getRotateCount() % 4)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramCropImageView = paramCropImageView.getBmp();
      j = m;
      if (k + m > paramCropImageView.getWidth())
        j = paramCropImageView.getWidth() - k;
      m = n;
      if (i + n > paramCropImageView.getHeight())
        m = paramCropImageView.getHeight() - i;
      ab.i("MicroMsg.CropImageUI", "rawWidth:%d, rawHeigth:%d, originalLX:%d, originalTY:%d, realWidth:%d, realHeight:%d", new Object[] { Integer.valueOf(paramCropImageView.getWidth()), Integer.valueOf(paramCropImageView.getHeight()), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(m) });
      paramArrayOfFloat = Bitmap.createBitmap(paramCropImageView, k, i, j, m, paramArrayOfFloat, true);
      AppMethodBeat.o(34852);
      break;
      paramArrayOfFloat.setRotate(0.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(90.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(180.0F, m / 2, n / 2);
      continue;
      paramArrayOfFloat.setRotate(270.0F, m / 2, n / 2);
    }
  }

  private boolean a(Bitmap paramBitmap, String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(34853);
    if ((paramString != null) && (!paramString.equals("")));
    while (true)
    {
      try
      {
        if (this.emC == 1)
        {
          d.a(paramBitmap, 30, Bitmap.CompressFormat.JPEG, paramString, paramBoolean);
          AppMethodBeat.o(34853);
          paramBoolean = bool;
          return paramBoolean;
        }
        d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, paramBoolean);
        continue;
      }
      catch (Exception paramBitmap)
      {
        ab.printErrStackTrace("MicroMsg.CropImageUI", paramBitmap, "", new Object[0]);
        ab.e("MicroMsg.CropImageUI", "saveBitmapToImage failed:" + paramBitmap.toString());
      }
      AppMethodBeat.o(34853);
      paramBoolean = false;
    }
  }

  private void c(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    AppMethodBeat.i(34845);
    this.zAT = ((FilterImageView)findViewById(2131823183));
    com.tencent.mm.platformtools.r.ci(this.zAT);
    this.zAT.setOnConfirmImp(paramRunnable1);
    this.zAT.setOnExitImp(paramRunnable2);
    AppMethodBeat.o(34845);
  }

  private static float[][] c(Matrix paramMatrix)
  {
    AppMethodBeat.i(34854);
    float[][] arrayOfFloat = new float[3][3];
    float[] arrayOfFloat1 = new float[9];
    paramMatrix.getValues(arrayOfFloat1);
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        arrayOfFloat[i][j] = arrayOfFloat1[(i * 3 + j)];
    AppMethodBeat.o(34854);
    return arrayOfFloat;
  }

  private boolean dJC()
  {
    AppMethodBeat.i(34844);
    Object localObject1;
    if (1 == this.zAR)
      if (this.zAT != null)
        localObject1 = this.zAT.getCropAreaView();
    int i;
    int j;
    boolean bool;
    while (true)
    {
      i = ((View)localObject1).getWidth();
      j = ((View)localObject1).getHeight();
      ab.v("MicroMsg.CropImageUI", "scrWidth:" + i + " scrHeight:" + j);
      this.filePath = getIntent().getStringExtra("CropImage_ImgPath");
      if (e.ct(this.filePath))
        break;
      finish();
      bool = false;
      AppMethodBeat.o(34844);
      return bool;
      localObject1 = findViewById(2131823171);
      continue;
      localObject1 = findViewById(2131823174);
    }
    int k = 960;
    int m = 960;
    int n;
    int i1;
    if (this.zAR == 2)
    {
      bool = true;
      n = j;
      i1 = i;
      this.zAY = BackwardSupportUtil.ExifHelper.bJ(this.filePath);
      if ((this.zAY != 90) && (this.zAY != 270))
        break label2321;
    }
    while (true)
    {
      Object localObject2 = d.d(this.filePath, i1, n, bool);
      Object localObject3 = e.e(this.filePath, 0, 10);
      if (com.tencent.mm.sdk.platformtools.r.bS((byte[])localObject3));
      float f1;
      for (this.zAS = 1; ; this.zAS = 0)
      {
        if (localObject2 != null)
          break label884;
        finish();
        bool = false;
        AppMethodBeat.o(34844);
        break;
        if (this.zAR == 3)
        {
          localObject2 = new BitmapFactory.Options();
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
          localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
          if (localObject3 != null)
            ((Bitmap)localObject3).recycle();
          m = ((BitmapFactory.Options)localObject2).outWidth;
          k = ((BitmapFactory.Options)localObject2).outHeight;
          f1 = 1.0F;
          if ((m > 640) || (k > 640))
            if (m > k)
            {
              f1 = k / m;
              i1 = 640;
              n = (int)(k * f1);
            }
          while (true)
          {
            ab.d("MicroMsg.CropImageUI", "w:%d h:%d width:%d height:%d scale:%f", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i1), Integer.valueOf(n), Float.valueOf(f1) });
            localObject3 = (Button)findViewById(2131823182);
            if (localObject3 != null)
              ((Button)localObject3).setVisibility(8);
            bool = false;
            break;
            f1 = m / k;
            n = 640;
            i1 = (int)(960.0F * f1);
            continue;
            n = k;
            i1 = m;
          }
        }
        if (this.zAR == 1)
        {
          localObject2 = new BitmapFactory.Options();
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
          localObject3 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject2);
          if (localObject3 != null)
          {
            ab.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localObject3.toString() });
            ((Bitmap)localObject3).recycle();
          }
          if (((BitmapFactory.Options)localObject2).outWidth > ((BitmapFactory.Options)localObject2).outHeight)
          {
            k = (int)(((BitmapFactory.Options)localObject2).outWidth * 960 * 1.0D / ((BitmapFactory.Options)localObject2).outHeight);
            n = m;
            i1 = k;
            if (k > 1920)
            {
              i1 = 1920;
              n = m;
            }
          }
          while (true)
          {
            bool = false;
            break;
            m = (int)(((BitmapFactory.Options)localObject2).outHeight * 960 * 1.0D / ((BitmapFactory.Options)localObject2).outWidth);
            n = m;
            i1 = k;
            if (m > 1920)
            {
              n = 1920;
              i1 = k;
            }
          }
        }
        localObject3 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = true;
        d.dnX();
        localObject2 = BitmapFactory.decodeFile(this.filePath, (BitmapFactory.Options)localObject3);
        if (localObject2 != null)
        {
          ab.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localObject2.toString() });
          ((Bitmap)localObject2).recycle();
        }
        if ((com.tencent.mm.platformtools.ah.cJ(((BitmapFactory.Options)localObject3).outWidth, ((BitmapFactory.Options)localObject3).outHeight)) && (((BitmapFactory.Options)localObject3).outWidth > 480))
        {
          bool = true;
          label746: this.zAZ = bool;
          if ((!com.tencent.mm.platformtools.ah.cI(((BitmapFactory.Options)localObject3).outWidth, ((BitmapFactory.Options)localObject3).outHeight)) || (((BitmapFactory.Options)localObject3).outHeight <= 480))
            break label870;
        }
        label870: for (bool = true; ; bool = false)
        {
          this.zBa = bool;
          if (!this.zAZ)
          {
            n = m;
            i1 = k;
            if (!this.zBa);
          }
          else
          {
            n = ((BitmapFactory.Options)localObject3).outHeight;
            i1 = ((BitmapFactory.Options)localObject3).outWidth;
          }
          ab.e("MicroMsg.CropImageUI", "width is " + i1 + " height is " + n);
          bool = false;
          break;
          bool = false;
          break label746;
        }
      }
      label884: ab.d("temBmp crop", "h:" + ((Bitmap)localObject2).getHeight() + "w: " + ((Bitmap)localObject2).getWidth());
      Bitmap localBitmap = d.b((Bitmap)localObject2, this.zAY);
      localObject2 = new Matrix();
      ((Matrix)localObject2).reset();
      float f2 = 1.0F;
      float f3;
      label993: label1002: float f4;
      if (bool)
      {
        f3 = localBitmap.getWidth() / i;
        f1 = localBitmap.getHeight() / j;
        if (f3 < f1)
        {
          f1 = f3;
          if (i <= j)
            break label1274;
          f3 = j;
          f4 = f3 / localBitmap.getWidth();
          f2 = f3 / localBitmap.getHeight();
          f3 = f2;
          if (f4 > f2)
            f3 = f4;
          if (f1 < 1.0D)
            ((Matrix)localObject2).postScale(f3, f3);
          label1058: if (1 != this.zAR)
            break label2164;
          if (this.zAT != null)
          {
            this.zAT.setMatrix((Matrix)localObject2);
            this.zAT.setImage(localBitmap);
          }
          label1091: if (this.zAR != 3)
            break label2251;
          if (!com.tencent.mm.sdk.platformtools.r.bS((byte[])localObject3))
            break label2243;
          this.zAS = 1;
        }
      }
      while (true)
      {
        try
        {
          localObject1 = c.bFN().eD(this.filePath, this.filePath);
          this.zAV.setImageDrawable((Drawable)localObject1);
          ((b)localObject1).start();
          ((Matrix)localObject2).reset();
          i1 = ((b)localObject1).getIntrinsicWidth();
          n = ((b)localObject1).getIntrinsicHeight();
          f1 = i / i1;
          f3 = j / n;
          if (f1 < f3)
          {
            f3 = i1 / i;
            f4 = n / j;
            if (f3 <= f4)
              continue;
            if (f3 <= 1.0D)
              continue;
            ((Matrix)localObject2).postScale(f1, f1);
            ((Matrix)localObject2).postTranslate((i - i1 * f1) / 2.0F, (j - f1 * n) / 2.0F);
            this.zAV.setImageMatrix((Matrix)localObject2);
            bool = true;
            AppMethodBeat.o(34844);
            break;
            break label993;
            label1274: f3 = i;
            break label1002;
            f3 = localBitmap.getWidth() / localBitmap.getHeight();
            f1 = localBitmap.getHeight() / localBitmap.getWidth();
            ab.v("MicroMsg.CropImageUI", "whDiv is " + f3 + " hwDiv is " + f1);
            if ((f1 >= 2.0F) && (localBitmap.getHeight() >= 480))
            {
              f3 = localBitmap.getWidth() / i;
              f1 = i / localBitmap.getWidth();
              if (1 == this.zAR)
              {
                f3 = j / localBitmap.getHeight();
                if (f1 > f3)
                {
                  ((Matrix)localObject2).postScale(f1, f1);
                  ((Matrix)localObject2).postTranslate((i - f1 * localBitmap.getWidth()) / 2.0F + ((View)localObject1).getLeft(), ((View)localObject1).getTop());
                  break label1058;
                }
                f1 = f3;
                continue;
              }
              if (f3 > 1.0D)
              {
                ((Matrix)localObject2).postScale(f1, f1);
                localBitmap.getHeight();
                ((Matrix)localObject2).postTranslate((i - f1 * localBitmap.getWidth()) / 2.0F, 0.0F);
                break label1058;
              }
              ((Matrix)localObject2).postScale(1.0F, 1.0F);
              if (3 == this.zAR)
              {
                ((Matrix)localObject2).postTranslate((i - localBitmap.getWidth()) / 2, (j - localBitmap.getHeight()) / 2);
                break label1058;
              }
              ((Matrix)localObject2).postTranslate((i - localBitmap.getWidth()) / 2, 0.0F);
              break label1058;
            }
            if ((f3 >= 2.0F) && (localBitmap.getWidth() >= 480))
            {
              f1 = localBitmap.getHeight() / 480.0F;
              f3 = 480.0F / localBitmap.getHeight();
              if (1 == this.zAR)
              {
                f1 = i / localBitmap.getWidth();
                f3 = j / localBitmap.getHeight();
                if (f1 > f3)
                {
                  ((Matrix)localObject2).postScale(f1, f1);
                  ((Matrix)localObject2).postTranslate((i - localBitmap.getWidth() * f1) / 2.0F + ((View)localObject1).getLeft(), (j - f1 * localBitmap.getHeight()) / 2.0F + ((View)localObject1).getTop());
                  break label1058;
                }
                f1 = f3;
                continue;
              }
              if (f1 > 1.0D)
              {
                ((Matrix)localObject2).postScale(f1, f3);
                ((Matrix)localObject2).postTranslate(0.0F, (j - 480) / 2);
                break label1058;
              }
              ((Matrix)localObject2).postScale(1.0F, 1.0F);
              f1 = (j - localBitmap.getHeight()) / 2;
              ab.d("MicroMsg.CropImageUI", " offsety ".concat(String.valueOf(f1)));
              ((Matrix)localObject2).postTranslate(0.0F, f1);
              break label1058;
            }
            f4 = i / localBitmap.getWidth();
            f3 = j / localBitmap.getHeight();
            if (f4 < f3)
            {
              f1 = f4;
              if (f4 <= f3)
                continue;
              if (1 != this.zAR)
                continue;
              ((Matrix)localObject2).postScale(f4, f4);
              ((Matrix)localObject2).postTranslate((i - localBitmap.getWidth() * f4) / 2.0F + ((View)localObject1).getLeft(), (j - f4 * localBitmap.getHeight()) / 2.0F + ((View)localObject1).getTop());
              break label1058;
            }
            f1 = f3;
            continue;
            f4 = f3;
            continue;
            if (this.zAS == 1)
            {
              this.zAV.setGifPath(this.filePath);
              this.zAV.getGifWidth();
              this.zAV.getGifHeight();
              f3 = this.zAV.getGifWidth() / i;
              f1 = this.zAV.getGifHeight() / j;
              if (f3 > f1)
              {
                f1 = f3;
                if (f1 <= 1.0D)
                  break label2315;
                ((Matrix)localObject2).postScale(f1, f1);
                ((Matrix)localObject2).postTranslate((i - this.zAV.getGifWidth() * f1) / 2.0F, (j - f1 * this.zAV.getGifHeight()) / 2.0F);
                break label1058;
              }
              continue;
            }
            f3 = localBitmap.getWidth() / i;
            f4 = localBitmap.getHeight() / j;
            if (f3 > f4)
            {
              f4 = f2;
              if (f3 > 1.0D)
              {
                ((Matrix)localObject2).postScale(f1, f1);
                f4 = f1;
              }
              ((Matrix)localObject2).postTranslate((i - localBitmap.getWidth() * f4) / 2.0F, (j - localBitmap.getHeight() * f4) / 2.0F);
              break label1058;
            }
            f3 = f4;
            continue;
            label2164: if (this.zAS == 1)
              break label1091;
            this.zAV.setImageMatrix((Matrix)localObject2);
            this.zAV.setImageBitmap(localBitmap);
            break label1091;
          }
          f1 = f3;
          continue;
          f3 = f4;
          continue;
          ((Matrix)localObject2).postTranslate((i - i1) / 2, (j - n) / 2);
          continue;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.CropImageUI", bo.l(localException));
          continue;
        }
        label2243: this.zAS = 0;
        continue;
        label2251: if ((this.zAZ) || (this.zBa))
          findViewById(2131823178).setVisibility(8);
        if (getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))
          findViewById(2131823181).setVisibility(8);
        bool = true;
        AppMethodBeat.o(34844);
        break;
        label2315: f1 = 1.0F;
      }
      label2321: k = n;
      n = i1;
      i1 = k;
    }
  }

  private void dJD()
  {
    AppMethodBeat.i(34846);
    c(new CropImageNewUI.22(this), new CropImageNewUI.23(this));
    AppMethodBeat.o(34846);
  }

  private void dJE()
  {
    AppMethodBeat.i(34847);
    c(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(34815);
        CropImageNewUI.a(CropImageNewUI.this, CropImageNewUI.e(CropImageNewUI.this).getCropImageIV(), CropImageNewUI.e(CropImageNewUI.this).getCropAreaView());
        CropImageNewUI.this.finish();
        AppMethodBeat.o(34815);
      }
    }
    , new CropImageNewUI.3(this));
    AppMethodBeat.o(34847);
  }

  private void dJF()
  {
    AppMethodBeat.i(34848);
    ((Button)findViewById(2131823178)).setOnClickListener(new CropImageNewUI.4(this));
    Button localButton1 = (Button)findViewById(2131823180);
    localButton1.setOnClickListener(new CropImageNewUI.5(this));
    Button localButton2 = (Button)findViewById(2131823179);
    localButton2.setOnClickListener(new CropImageNewUI.6(this));
    ap localap1 = new ap(new CropImageNewUI.7(this), true);
    final ap localap2 = new ap(new CropImageNewUI.8(this), true);
    localButton1.setOnTouchListener(new CropImageNewUI.9(this, localap1));
    localButton2.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(34823);
        switch (paramAnonymousMotionEvent.getAction())
        {
        default:
        case 0:
        case 1:
        }
        while (true)
        {
          AppMethodBeat.o(34823);
          return false;
          localap2.ae(200L, 200L);
          continue;
          localap2.stopTimer();
        }
      }
    });
    AppMethodBeat.o(34848);
  }

  private void dJG()
  {
    AppMethodBeat.i(34849);
    int i = getIntent().getIntExtra("CropImage_CompressType", 1);
    boolean bool = getIntent().getBooleanExtra("CropImage_BHasHD", false);
    if ((i != 1) && (bool))
    {
      findViewById(2131823181).setVisibility(0);
      Button localButton = (Button)findViewById(2131823182);
      localButton.setBackgroundResource(2130838007);
      localButton.setPadding(25, 8, 25, 8);
      localButton.setOnClickListener(new CropImageNewUI.11(this));
      AppMethodBeat.o(34849);
    }
    while (true)
    {
      return;
      findViewById(2131823181).setVisibility(8);
      AppMethodBeat.o(34849);
    }
  }

  private int[] dJH()
  {
    AppMethodBeat.i(34850);
    Object localObject1 = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
    int i = ((Rect)localObject1).top;
    ab.e("MicroMsg.CropImageUI", "window TitleBar.h:".concat(String.valueOf(i)));
    int j = i;
    if (i == 0)
      j = i;
    label292: 
    while (true)
      try
      {
        localObject1 = Class.forName("com.android.internal.R$dimen");
        j = i;
        Object localObject2 = ((Class)localObject1).newInstance();
        j = i;
        int k = com.tencent.mm.platformtools.ah.getInt(((Class)localObject1).getField("status_bar_height").get(localObject2).toString(), 0);
        j = i;
        i = getResources().getDimensionPixelSize(k);
        j = i;
        ab.e("MicroMsg.CropImageUI", "sbar:".concat(String.valueOf(i)));
        j = i;
        localObject1 = new DisplayMetrics();
        ((WindowManager)getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        int m = (int)(67.0F * ((DisplayMetrics)localObject1).density / 1.5D);
        k = Math.min(this.zAX.getWidth(), this.zAX.getHeight());
        int n = Math.max(this.zAX.getWidth(), this.zAX.getHeight());
        i = k - m * 2 - j;
        if (this.zAY != 0)
          break label292;
        k += j + m * 2;
        i += m;
        AppMethodBeat.o(34850);
        return new int[] { k, n - m * 2, i, n + j + m };
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.CropImageUI", localException, "", new Object[0]);
      }
  }

  private Bitmap hv(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34851);
    Bitmap localBitmap = d.d(this.filePath, paramInt2, paramInt1, true);
    Object localObject = localBitmap;
    if (this.zAY != 0)
    {
      localObject = new Matrix();
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setRotate(this.zAY, localBitmap.getWidth() / 2, localBitmap.getHeight() / 2);
      localObject = Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), (Matrix)localObject, true);
      if (localBitmap != localObject)
      {
        ab.i("MicroMsg.CropImageUI", "recycle bitmap:%s", new Object[] { localBitmap.toString() });
        localBitmap.recycle();
      }
    }
    ab.d("MicroMsg.CropImageUI", "getcrop degree:" + this.zAY);
    AppMethodBeat.o(34851);
    return localObject;
  }

  public final int getLayoutId()
  {
    return 2130969255;
  }

  public final void initView()
  {
    AppMethodBeat.i(34842);
    setMMTitle("");
    this.zAU = ((LinearLayout)findViewById(2131823176));
    this.zAW = ((ImageView)findViewById(2131823172));
    com.tencent.mm.platformtools.r.ci(this.zAW);
    this.zAX = findViewById(2131823171);
    this.zAR = getIntent().getIntExtra("CropImageMode", 0);
    boolean bool1;
    boolean bool2;
    label236: CropImageNewUI.17 local17;
    if (this.zAR != 0)
    {
      bool1 = true;
      Assert.assertTrue("the image mode must be set", bool1);
      this.emC = getIntent().getIntExtra("CropImage_from_scene", 0);
      bool1 = getIntent().getBooleanExtra("CropImage_Filter", false);
      bool2 = getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false);
      if (bool1)
        dJD();
      this.zBb = false;
      this.zAV = ((CropImageView)findViewById(2131823175));
      com.tencent.mm.platformtools.r.ci(this.zAV);
      this.zAV.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(34814);
          if (!CropImageNewUI.a(CropImageNewUI.this))
            AppMethodBeat.o(34814);
          while (true)
          {
            return;
            if ((!CropImageNewUI.b(CropImageNewUI.this)) && (!CropImageNewUI.c(CropImageNewUI.this)) && (CropImageNewUI.this.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)))
            {
              CropImageNewUI.d(CropImageNewUI.this);
              if (!CropImageNewUI.this.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).getBoolean("CropImage_Filter_Show", true))
                CropImageNewUI.e(CropImageNewUI.this).findViewById(2131823173).setVisibility(4);
              AppMethodBeat.o(34814);
            }
            else
            {
              if (1 == CropImageNewUI.f(CropImageNewUI.this))
                CropImageNewUI.g(CropImageNewUI.this);
              AppMethodBeat.o(34814);
            }
          }
        }
      });
      this.zAV.setOnShortClick(new CropImageNewUI.12(this));
      dJF();
      switch (this.zAR)
      {
      case 4:
      default:
        ab.d("MicroMsg.CropImageUI", "mode is  " + this.zAR);
        local17 = new CropImageNewUI.17(this, bool1, bool2);
        if (this.zAR == 5)
          addIconOptionMenu(0, 2130839555, local17);
        break;
      case 1:
      case 2:
      case 3:
      case 5:
      }
    }
    while (true)
    {
      if ((bool1) && (bool2))
        a(0, getString(2131298805), local17, q.b.ymu);
      setBackBtn(new CropImageNewUI.19(this));
      if (this.zAR == 6)
      {
        findViewById(2131823181).setVisibility(8);
        a(0, getString(2131298809), new CropImageNewUI.20(this), q.b.ymu);
      }
      AppMethodBeat.o(34842);
      return;
      bool1 = false;
      break;
      dJE();
      this.zAT.setLimitZoomIn(false);
      this.zAT.dJL();
      this.zAT.setCropMaskVisible(0);
      if (this.emC != 1)
        break label236;
      this.zAT.setCropMaskBackground(2130839674);
      break label236;
      this.zAV.setEnableOprate(false);
      findViewById(2131823177).setVisibility(8);
      findViewById(2131823181).setVisibility(8);
      break label236;
      this.zAU.setVisibility(8);
      break label236;
      dJG();
      break label236;
      if (this.zAR == 4)
      {
        addIconOptionMenu(0, 2130839555, local17);
        findViewById(2131823181).setVisibility(0);
        Button localButton = (Button)findViewById(2131823182);
        localButton.setText(2131298805);
        localButton.setOnClickListener(new CropImageNewUI.18(this));
      }
      else
      {
        a(0, getString(2131298809), local17, q.b.ymu);
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(34843);
    ab.d("MicroMsg.CropImageUI", "onConfigurationChanged, config.orientation = " + paramConfiguration.orientation);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      ab.v("MicroMsg.CropImageUI", "onConfigurationChanged");
      this.zAV.post(new CropImageNewUI.21(this));
    }
    super.onConfigurationChanged(paramConfiguration);
    AppMethodBeat.o(34843);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34838);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(34838);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34841);
    Object localObject;
    if (this.zAV != null)
    {
      localObject = this.zAV;
      if ((((CropImageView)localObject).mQQ != null) && (!((CropImageView)localObject).mQQ.isRecycled()))
      {
        ab.i("MicroMsg.CropImageView", "recycle bitmap:%s", new Object[] { ((CropImageView)localObject).mQQ.toString() });
        ((CropImageView)localObject).mQQ.recycle();
      }
      if (((CropImageView)localObject).zBy != null)
      {
        ((CropImageView)localObject).zBy.cancel();
        ((CropImageView)localObject).zBy = null;
      }
      ((CropImageView)localObject).zBz.removeCallbacksAndMessages(null);
      ((CropImageView)localObject).zBB.removeCallbacksAndMessages(null);
    }
    if (this.zAT != null)
    {
      localObject = this.zAT;
      ((FilterImageView)localObject).zBP = null;
      if ((((FilterImageView)localObject).zBT != null) && (!((FilterImageView)localObject).zBT.isRecycled()))
      {
        ab.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { ((FilterImageView)localObject).zBT.toString() });
        ((FilterImageView)localObject).zBT.recycle();
      }
      ((FilterImageView)localObject).zBT = null;
    }
    super.onDestroy();
    AppMethodBeat.o(34841);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(34839);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    initView();
    AppMethodBeat.o(34839);
  }

  public void onResume()
  {
    AppMethodBeat.i(34840);
    super.onResume();
    setRequestedOrientation(1);
    AppMethodBeat.o(34840);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI
 * JD-Core Version:    0.6.2
 */