package com.tencent.mm.plugin.story.ui.view;

import a.f.a.b;
import a.l;
import a.y;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/ViewClickHelper;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "clickDelay", "", "clickRecord", "", "endRecordRunnable", "Ljava/lang/Runnable;", "isRecording", "", "onClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onDoubleClickListener", "getOnDoubleClickListener", "setOnDoubleClickListener", "onTripleClickListener", "getOnTripleClickListener", "setOnTripleClickListener", "checkDispatch", "dispatchClickEvent", "recordClick", "plugin-story_release"})
public final class h
{
  boolean isRecording;
  b<? super View, y> skq;
  public b<? super View, y> skr;
  b<? super View, y> sks;
  int skt;
  final long sku;
  Runnable skv;
  private final View view;

  public h(View paramView)
  {
    AppMethodBeat.i(110474);
    this.view = paramView;
    this.sku = ViewConfiguration.getDoubleTapTimeout();
    this.skv = ((Runnable)new h.a(this));
    AppMethodBeat.o(110474);
  }

  final void cCq()
  {
    AppMethodBeat.i(110473);
    switch (this.skt)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.skt = 0;
      this.isRecording = false;
      AppMethodBeat.o(110473);
      return;
      b localb = this.skq;
      if (localb != null)
      {
        localb.am(this.view);
        continue;
        localb = this.skr;
        if (localb != null)
        {
          localb.am(this.view);
          continue;
          localb = this.sks;
          if (localb != null)
            localb.am(this.view);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.h
 * JD-Core Version:    0.6.2
 */