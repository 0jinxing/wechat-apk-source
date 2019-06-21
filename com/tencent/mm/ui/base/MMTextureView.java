package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;

@TargetApi(14)
public class MMTextureView extends TextureView
{
  private Field yxT;

  public MMTextureView(Context paramContext)
  {
    super(paramContext);
  }

  public MMTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void dAh()
  {
    AppMethodBeat.i(106863);
    if (d.fP(16))
    {
      ab.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      AppMethodBeat.o(106863);
    }
    while (true)
    {
      return;
      if (d.iX(20))
      {
        ab.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        AppMethodBeat.o(106863);
      }
      else if (q.etn.esC == 2)
      {
        ab.i("MicroMsg.MMTextureView", "do not do sly textureView, config ERROR");
        AppMethodBeat.o(106863);
      }
      else
      {
        ab.i("MicroMsg.MMTextureView", "detect texture problem, sly");
        try
        {
          if (this.yxT == null)
          {
            this.yxT = TextureView.class.getDeclaredField("mSurface");
            this.yxT.setAccessible(true);
          }
          SurfaceTexture localSurfaceTexture = (SurfaceTexture)this.yxT.get(this);
          if (localSurfaceTexture != null)
            if (!(localSurfaceTexture instanceof r))
            {
              r localr = new com/tencent/mm/ui/base/r;
              localr.<init>();
              localr.mSurfaceTexture = localSurfaceTexture;
              this.yxT.set(this, localr);
              ab.i("MicroMsg.MMTextureView", "detect texture problem, wrap");
              AppMethodBeat.o(106863);
            }
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          ab.printErrStackTrace("MicroMsg.MMTextureView", localNoSuchFieldException, "", new Object[0]);
          ab.e("MicroMsg.MMTextureView", "detect texture problem, NoSuchFieldException");
          AppMethodBeat.o(106863);
          continue;
          ab.i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
          AppMethodBeat.o(106863);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          ab.printErrStackTrace("MicroMsg.MMTextureView", localIllegalArgumentException, "", new Object[0]);
          ab.e("MicroMsg.MMTextureView", "detect texture problem, IllegalArgumentException");
          AppMethodBeat.o(106863);
          continue;
          ab.i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
          AppMethodBeat.o(106863);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          ab.printErrStackTrace("MicroMsg.MMTextureView", localIllegalAccessException, "", new Object[0]);
          ab.e("MicroMsg.MMTextureView", "detect texture problem, IllegalAccessException");
          AppMethodBeat.o(106863);
        }
      }
    }
  }

  @TargetApi(14)
  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(106862);
    try
    {
      super.onDetachedFromWindow();
      AppMethodBeat.o(106862);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMTextureView", localException, "unkown error", new Object[0]);
        AppMethodBeat.o(106862);
      }
    }
  }

  @TargetApi(16)
  public void setSurfaceTexture(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(106864);
    super.setSurfaceTexture(paramSurfaceTexture);
    dAh();
    AppMethodBeat.o(106864);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTextureView
 * JD-Core Version:    0.6.2
 */