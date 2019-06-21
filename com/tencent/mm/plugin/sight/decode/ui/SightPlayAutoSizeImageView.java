package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.a.b.g;
import com.tencent.mm.sdk.platformtools.ab;

public class SightPlayAutoSizeImageView extends ImageView
  implements com.tencent.mm.plugin.sight.decode.a.a
{
  private b qyA;

  public SightPlayAutoSizeImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SightPlayAutoSizeImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(24958);
    this.qyA = new SightPlayAutoSizeImageView.a(this);
    AppMethodBeat.o(24958);
  }

  public final void bf(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(24960);
    this.qyA.bf(paramString, paramBoolean);
    AppMethodBeat.o(24960);
  }

  public final void ckX()
  {
    AppMethodBeat.i(24965);
    setImageBitmap(null);
    setImageResource(2130839707);
    AppMethodBeat.o(24965);
  }

  public final boolean ckY()
  {
    AppMethodBeat.i(24961);
    boolean bool = this.qyA.clb();
    AppMethodBeat.o(24961);
    return bool;
  }

  public final void clear()
  {
    AppMethodBeat.i(24959);
    this.qyA.clear();
    AppMethodBeat.o(24959);
  }

  public final void fi(int paramInt1, int paramInt2)
  {
  }

  public Object getTagObject()
  {
    AppMethodBeat.i(24967);
    Object localObject = getTag();
    AppMethodBeat.o(24967);
    return localObject;
  }

  public Context getUIContext()
  {
    AppMethodBeat.i(24968);
    Context localContext = getContext();
    AppMethodBeat.o(24968);
    return localContext;
  }

  public String getVideoPath()
  {
    return this.qyA.ien;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(24963);
    ab.d("MicroMsg.SightPlayAutoSizeImageView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.xxA.c(this.qyA.cld());
    AppMethodBeat.o(24963);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(24962);
    super.onDetachedFromWindow();
    ab.i("MicroMsg.SightPlayAutoSizeImageView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.qyA.clear();
    com.tencent.mm.sdk.b.a.xxA.d(this.qyA.cld());
    AppMethodBeat.o(24962);
  }

  public void setCanPlay(boolean paramBoolean)
  {
    this.qyA.qxI = paramBoolean;
  }

  public void setDrawableWidth(int paramInt)
  {
  }

  public void setForceRecordState(boolean paramBoolean)
  {
    this.qyA.qxR = paramBoolean;
  }

  public void setIsWhatsNew(boolean paramBoolean)
  {
    this.qyA.qxL = paramBoolean;
  }

  public void setMaskID(int paramInt)
  {
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
    AppMethodBeat.i(24970);
    this.qyA.setSightInfoView(paramTextView);
    AppMethodBeat.o(24970);
  }

  public void setTagObject(Object paramObject)
  {
    AppMethodBeat.i(24966);
    setTag(paramObject);
    AppMethodBeat.o(24966);
  }

  public void setThumbBgView(View paramView)
  {
    AppMethodBeat.i(24969);
    this.qyA.setThumbBgView(paramView);
    AppMethodBeat.o(24969);
  }

  public void setThumbBmp(Bitmap paramBitmap)
  {
    AppMethodBeat.i(24964);
    setImageBitmap(paramBitmap);
    AppMethodBeat.o(24964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SightPlayAutoSizeImageView
 * JD-Core Version:    0.6.2
 */