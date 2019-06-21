package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;

public class ShowCommentImageView extends ImageView
{
  private static Bitmap rmU;
  private static Bitmap rmV;
  private static Field rmW;
  private static Field rmX;
  private static boolean rmY = false;
  private boolean rmT;

  public ShowCommentImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38572);
    this.rmT = false;
    init();
    AppMethodBeat.o(38572);
  }

  public ShowCommentImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38573);
    this.rmT = false;
    init();
    AppMethodBeat.o(38573);
  }

  private void J(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(38577);
    if (paramBoolean1);
    try
    {
      for (Field localField = rmW; paramBoolean2; localField = rmX)
      {
        localField.set(this, null);
        AppMethodBeat.o(38577);
        return;
      }
      Bitmap localBitmap;
      if (paramBoolean1)
      {
        localBitmap = rmV;
        label45: if (localBitmap != null)
          break label105;
      }
      label105: for (paramBoolean2 = true; ; paramBoolean2 = false)
      {
        ab.d("MicroMsg.ShowCommentImageView", "setDrawingCache, autoScale: %s, cache==null: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
        if (localBitmap != null)
          localField.set(this, localBitmap);
        AppMethodBeat.o(38577);
        break;
        localBitmap = rmU;
        break label45;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(38577);
      }
    }
  }

  private static void init()
  {
    AppMethodBeat.i(38574);
    if ((rmW != null) && (rmX != null))
      AppMethodBeat.o(38574);
    while (true)
    {
      return;
      try
      {
        rmW = View.class.getDeclaredField("mDrawingCache");
        rmX = View.class.getDeclaredField("mUnscaledDrawingCache");
        rmW.setAccessible(true);
        rmX.setAccessible(true);
        rmY = true;
        AppMethodBeat.o(38574);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ShowCommentImageView", "init error: %s", new Object[] { localException.getMessage() });
        rmY = false;
        AppMethodBeat.o(38574);
      }
    }
  }

  private boolean lf(boolean paramBoolean)
  {
    AppMethodBeat.i(38576);
    if (!rmY)
    {
      AppMethodBeat.o(38576);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      if (paramBoolean);
      try
      {
        for (Field localField = rmW; ; localField = rmX)
        {
          if ((Bitmap)localField.get(this) == null)
            break label56;
          AppMethodBeat.o(38576);
          paramBoolean = true;
          break;
        }
        label56: AppMethodBeat.o(38576);
        paramBoolean = false;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ShowCommentImageView", localException, "", new Object[0]);
        ab.e("MicroMsg.ShowCommentImageView", "checkIfCanReuseDrawingCache error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(38576);
        paramBoolean = false;
      }
    }
  }

  public void buildDrawingCache(boolean paramBoolean)
  {
    AppMethodBeat.i(38575);
    Object localObject;
    if (rmY)
      if (!this.rmT)
        if (!lf(paramBoolean))
          if (paramBoolean)
          {
            localObject = rmV;
            if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
              break label64;
            J(paramBoolean, false);
            AppMethodBeat.o(38575);
          }
    while (true)
    {
      return;
      localObject = rmU;
      break;
      label64: super.buildDrawingCache(paramBoolean);
      if (paramBoolean);
      Field localField;
      while (true)
      {
        try
        {
          localObject = rmW;
          localObject = (Bitmap)((Field)localObject).get(this);
          if (localObject != null)
            break label171;
          bool = true;
          ab.d("MicroMsg.ShowCommentImageView", "getStaticDrawingCache, autoScale: %s, cache==null: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
          if (localObject == null)
            break label180;
          if (!paramBoolean)
            break label176;
          rmV = (Bitmap)localObject;
          AppMethodBeat.o(38575);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.ShowCommentImageView", "getStaticDrawingCache error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(38575);
        }
        break;
        localField = rmX;
        continue;
        label171: boolean bool = false;
      }
      label176: rmU = localField;
      label180: AppMethodBeat.o(38575);
      continue;
      super.buildDrawingCache(paramBoolean);
      AppMethodBeat.o(38575);
      continue;
      J(paramBoolean, true);
      super.buildDrawingCache(paramBoolean);
      AppMethodBeat.o(38575);
    }
  }

  public void destroyDrawingCache()
  {
    AppMethodBeat.i(38579);
    super.destroyDrawingCache();
    AppMethodBeat.o(38579);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(38578);
    try
    {
      rmW.set(this, null);
      rmX.set(this, null);
      super.onDetachedFromWindow();
      AppMethodBeat.o(38578);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", new Object[] { localException.getMessage() });
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(38581);
    if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
      postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(38571);
          ShowCommentImageView.a(ShowCommentImageView.this, false);
          AppMethodBeat.o(38571);
        }
      }
      , 100L);
    while (true)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(38581);
      return bool;
      this.rmT = true;
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(38580);
    super.setOnClickListener(new ShowCommentImageView.1(this, paramOnClickListener));
    AppMethodBeat.o(38580);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ShowCommentImageView
 * JD-Core Version:    0.6.2
 */