package com.tencent.mm.plugin.sight.decode.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.a.b.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.MMTextureView;

@TargetApi(14)
public class SightPlayTextureView extends MMTextureView
  implements com.tencent.mm.plugin.sight.decode.a.a
{
  private Surface mSurface;
  private b qyA;
  private int qyC;
  private boolean qyH;
  private int qyM;
  private int videoHeight;
  private int videoWidth;

  public SightPlayTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SightPlayTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(24980);
    this.qyH = false;
    setOpaque(false);
    this.qyA = new SightPlayTextureView.b(this);
    setSurfaceTextureListener(new SightPlayTextureView.1(this));
    AppMethodBeat.o(24980);
  }

  private void A(double paramDouble)
  {
    AppMethodBeat.i(24987);
    final ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    if (localLayoutParams.height != (int)(this.qyC * paramDouble))
    {
      localLayoutParams.width = this.qyC;
      localLayoutParams.height = ((int)(this.qyC * paramDouble));
      if ((this.qyH) && (localLayoutParams.height < com.tencent.mm.bz.a.fromDPToPix(getContext(), 50)))
        localLayoutParams.height = com.tencent.mm.bz.a.fromDPToPix(getContext(), 50);
      ab.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
      if (al.isMainThread())
      {
        setLayoutParams(localLayoutParams);
        AppMethodBeat.o(24987);
      }
    }
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(24974);
          SightPlayTextureView.this.setLayoutParams(localLayoutParams);
          AppMethodBeat.o(24974);
        }
      });
      AppMethodBeat.o(24987);
    }
  }

  public final void bf(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(24982);
    this.qyA.bf(paramString, paramBoolean);
    AppMethodBeat.o(24982);
  }

  public final void ckX()
  {
    AppMethodBeat.i(24989);
    Bitmap localBitmap1 = b.b(getContext(), 2130839707, this.qyC, 320, 240);
    Bitmap localBitmap2 = b.b(getContext(), this.qyM, this.qyC, 320, 240);
    SightVideoJNI.drawSurfaceThumb(this.mSurface, localBitmap1, localBitmap2);
    AppMethodBeat.o(24989);
  }

  public final boolean ckY()
  {
    AppMethodBeat.i(24983);
    boolean bool = this.qyA.clb();
    AppMethodBeat.o(24983);
    return bool;
  }

  public final void clear()
  {
    AppMethodBeat.i(24981);
    this.qyA.clear();
    AppMethodBeat.o(24981);
  }

  public final void fi(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24993);
    final ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    this.qyC = paramInt1;
    localLayoutParams.width = this.qyC;
    localLayoutParams.height = (this.qyC * paramInt2 / paramInt1);
    ab.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
    if (al.isMainThread())
    {
      setLayoutParams(localLayoutParams);
      AppMethodBeat.o(24993);
    }
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(24975);
          SightPlayTextureView.this.setLayoutParams(localLayoutParams);
          AppMethodBeat.o(24975);
        }
      });
      AppMethodBeat.o(24993);
    }
  }

  public Object getTagObject()
  {
    AppMethodBeat.i(24991);
    Object localObject = getTag();
    AppMethodBeat.o(24991);
    return localObject;
  }

  public Context getUIContext()
  {
    AppMethodBeat.i(24992);
    Context localContext = getContext();
    AppMethodBeat.o(24992);
    return localContext;
  }

  public String getVideoPath()
  {
    return this.qyA.ien;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(24985);
    ab.d("MicroMsg.SightPlayTextureView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.xxA.c(this.qyA.cld());
    AppMethodBeat.o(24985);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(24984);
    super.onDetachedFromWindow();
    ab.i("MicroMsg.SightPlayTextureView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.qyA.clear();
    com.tencent.mm.sdk.b.a.xxA.d(this.qyA.cld());
    AppMethodBeat.o(24984);
  }

  public void setCanPlay(boolean paramBoolean)
  {
    this.qyA.qxI = paramBoolean;
  }

  public void setDrawableWidth(int paramInt)
  {
    AppMethodBeat.i(24986);
    this.qyC = paramInt;
    A(0.75D);
    AppMethodBeat.o(24986);
  }

  public void setForceRecordState(boolean paramBoolean)
  {
  }

  public void setIsWhatsNew(boolean paramBoolean)
  {
    this.qyA.qxL = paramBoolean;
  }

  public void setMaskID(int paramInt)
  {
    this.qyM = paramInt;
  }

  public void setOnCompletionListener(b.e parame)
  {
    this.qyA.qxT = parame;
  }

  public void setOnDecodeDurationListener(b.f paramf)
  {
    this.qyA.qxU = paramf;
  }

  public void setOnSightCompletionAction(b.g paramg)
  {
  }

  public void setPosition(int paramInt)
  {
    this.qyA.position = paramInt;
  }

  public void setSightInfoView(TextView paramTextView)
  {
    AppMethodBeat.i(24995);
    this.qyA.setSightInfoView(paramTextView);
    AppMethodBeat.o(24995);
  }

  public void setTagObject(Object paramObject)
  {
    AppMethodBeat.i(24990);
    setTag(paramObject);
    AppMethodBeat.o(24990);
  }

  public void setThumbBgView(View paramView)
  {
    AppMethodBeat.i(24994);
    this.qyA.setThumbBgView(paramView);
    AppMethodBeat.o(24994);
  }

  public void setThumbBmp(Bitmap paramBitmap)
  {
    AppMethodBeat.i(24988);
    boolean bool1;
    boolean bool2;
    if (paramBitmap == null)
    {
      bool1 = true;
      if (this.mSurface != null)
        break label184;
      bool2 = true;
      label21: ab.d("MicroMsg.SightPlayTextureView", "thumb is null? %B, surface is null? %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if (paramBitmap == null)
        break label205;
      ab.d("MicroMsg.SightPlayTextureView", "thumb size [%d, %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()) });
      if (this.qyH)
      {
        if (paramBitmap.getWidth() < paramBitmap.getHeight())
          break label189;
        this.qyC = com.tencent.mm.bz.a.fromDPToPix(getContext(), 150);
      }
      label115: Bitmap localBitmap = b.b(getContext(), this.qyM, this.qyC, paramBitmap.getWidth(), paramBitmap.getHeight());
      A(paramBitmap.getHeight() / paramBitmap.getWidth());
      this.qyA.qxs = localBitmap;
      this.qyA.T(paramBitmap);
      AppMethodBeat.o(24988);
    }
    while (true)
    {
      return;
      bool1 = false;
      break;
      label184: bool2 = false;
      break label21;
      label189: this.qyC = com.tencent.mm.bz.a.fromDPToPix(getContext(), 85);
      break label115;
      label205: this.qyA.T(null);
      AppMethodBeat.o(24988);
    }
  }

  static final class a
    implements Runnable
  {
    Surface qyO = null;

    public final void run()
    {
      AppMethodBeat.i(24976);
      if (this.qyO == null)
        AppMethodBeat.o(24976);
      while (true)
      {
        return;
        this.qyO.release();
        AppMethodBeat.o(24976);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SightPlayTextureView
 * JD-Core Version:    0.6.2
 */