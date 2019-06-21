package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.tools.MMGestureGallery;

public class GetHdHeadImageGalleryView extends MMGestureGallery
{
  private String qln;
  private String username;
  private o vht;
  private Bitmap vhu;
  private Bitmap vhv;
  private GetHdHeadImageGalleryView.a vhw;

  public GetHdHeadImageGalleryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(79687);
    init();
    AppMethodBeat.o(79687);
  }

  public GetHdHeadImageGalleryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(79686);
    init();
    AppMethodBeat.o(79686);
  }

  private void init()
  {
    AppMethodBeat.i(79688);
    this.vhw = new GetHdHeadImageGalleryView.a(this, (byte)0);
    setVerticalFadingEdgeEnabled(false);
    setHorizontalFadingEdgeEnabled(false);
    setAdapter(this.vhw);
    setSelection(0);
    setSingleClickOverListener(new GetHdHeadImageGalleryView.c(this, (byte)0));
    setLongClickOverListener(new GetHdHeadImageGalleryView.b(this, (byte)0));
    AppMethodBeat.o(79688);
  }

  public void setHdHeadImage(Bitmap paramBitmap)
  {
    AppMethodBeat.i(79690);
    this.vhv = paramBitmap;
    this.vhw.notifyDataSetChanged();
    AppMethodBeat.o(79690);
  }

  public void setHdHeadImagePath(String paramString)
  {
    this.qln = paramString;
  }

  public void setParentWindow(o paramo)
  {
    this.vht = paramo;
  }

  public void setThumbImage(Bitmap paramBitmap)
  {
    AppMethodBeat.i(79689);
    this.vhu = paramBitmap;
    this.vhw.notifyDataSetChanged();
    AppMethodBeat.o(79689);
  }

  public void setUsername(String paramString)
  {
    this.username = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView
 * JD-Core Version:    0.6.2
 */