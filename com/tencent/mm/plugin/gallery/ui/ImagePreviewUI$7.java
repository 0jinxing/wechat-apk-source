package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class ImagePreviewUI$7 extends RecyclerView.h
{
  ImagePreviewUI$7(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(21502);
    int i = (int)ah.getContext().getResources().getDimension(2131427776);
    paramRect.left = (i / 2);
    paramRect.bottom = i;
    paramRect.top = i;
    paramRect.right = (i / 2);
    AppMethodBeat.o(21502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.7
 * JD-Core Version:    0.6.2
 */