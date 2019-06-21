package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.model.a.c;
import com.tencent.mm.plugin.emojicapture.model.a.c.a;
import com.tencent.mm.ui.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/media/editor/panel/IEditorPanel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "callback", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "Lkotlin/ParameterName;", "name", "info", "", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "firstSelectSticker", "layoutManager", "Lcom/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager;", "selectedPosition", "stickerAdapter", "Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter;", "stickerCallback", "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$stickerCallback$1", "Lcom/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$stickerCallback$1;", "stickerRecycler", "Landroid/support/v7/widget/RecyclerView;", "timeEnter", "", "isShow", "", "refreshSelected", "reset", "selectItem", "position", "setOnVisibleChangeCallback", "visible", "setShow", "show", "setup", "selectSticker", "plugin-emojicapture_release"})
public final class EditorStickerView extends RelativeLayout
{
  private final String TAG;
  private a.f.a.b<? super com.tencent.mm.plugin.emojicapture.model.a.b, y> exD;
  private long ezZ;
  private int llU;
  private final RecyclerView lmL;
  private final com.tencent.mm.plugin.emojicapture.ui.a.a lmM;
  private final com.tencent.mm.plugin.emojicapture.ui.c.a lmN;
  private String lmO;
  private final EditorStickerView.c lmP;

  public EditorStickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(3015);
    AppMethodBeat.o(3015);
  }

  public EditorStickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3014);
    this.TAG = "MicroMsg.EditorStickerView";
    this.llU = -1;
    View.inflate(paramContext, 2130969330, (ViewGroup)this);
    paramAttributeSet = findViewById(2131823443);
    j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_sticker_recycler)");
    this.lmL = ((RecyclerView)paramAttributeSet);
    this.lmN = new com.tencent.mm.plugin.emojicapture.ui.c.a(paramContext);
    this.lmL.setLayoutManager((RecyclerView.i)this.lmN);
    this.lmM = new com.tencent.mm.plugin.emojicapture.ui.a.a();
    new ai().i(this.lmL);
    this.lmL.setAdapter((RecyclerView.a)this.lmM);
    this.lmM.llV = ((m)new EditorStickerView.1(this));
    float f = (ak.hy(paramContext).x - getResources().getDimension(2131428335)) / 2.0F - com.tencent.mm.bz.a.fromDPToPix(paramContext, 8);
    this.lmL.setPadding((int)f, 0, (int)f, 0);
    this.lmP = new EditorStickerView.c(this);
    AppMethodBeat.o(3014);
  }

  public final void boa()
  {
    AppMethodBeat.i(3012);
    com.tencent.mm.ab.b.a(200L, (a.f.a.a)new EditorStickerView.a(this));
    AppMethodBeat.o(3012);
  }

  public final a.f.a.b<com.tencent.mm.plugin.emojicapture.model.a.b, y> getCallback()
  {
    return this.exD;
  }

  public final void m(long paramLong, String paramString)
  {
    AppMethodBeat.i(3011);
    this.ezZ = paramLong;
    this.lmO = paramString;
    paramString = c.lhS;
    c.a((c.a)this.lmP);
    AppMethodBeat.o(3011);
  }

  public final void setCallback(a.f.a.b<? super com.tencent.mm.plugin.emojicapture.model.a.b, y> paramb)
  {
    this.exD = paramb;
  }

  public final void setOnVisibleChangeCallback(a.f.a.b<? super Boolean, y> paramb)
  {
  }

  public final void setShow(boolean paramBoolean)
  {
    AppMethodBeat.i(3013);
    if (paramBoolean)
      if ((getVisibility() == 0) && (getAlpha() == 1.0F))
        AppMethodBeat.o(3013);
    while (true)
    {
      return;
      setVisibility(0);
      animate().cancel();
      animate().alpha(1.0F).start();
      AppMethodBeat.o(3013);
      continue;
      if ((getVisibility() != 0) || (getAlpha() == 0.0F))
      {
        AppMethodBeat.o(3013);
      }
      else
      {
        animate().cancel();
        animate().alpha(0.0F).withEndAction((Runnable)new EditorStickerView.b(this)).start();
        AppMethodBeat.o(3013);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView
 * JD-Core Version:    0.6.2
 */