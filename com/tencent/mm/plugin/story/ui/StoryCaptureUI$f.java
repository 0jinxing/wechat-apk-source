package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.al;
import com.tencent.mm.plugin.story.f.c;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.ui.view.CaptureView;
import com.tencent.mm.plugin.story.ui.view.editor.EditorView;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StoryCaptureUI$uiNavigation$1", "Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$UINavigation;", "exit", "", "go2Capture", "onEditorPrepared", "prepareEditor", "captureInfo", "Lcom/tencent/mm/plugin/story/data/StoryCaptureInfo;", "plugin-story_release"})
public final class StoryCaptureUI$f
  implements StoryCaptureUI.b
{
  public final void b(com.tencent.mm.plugin.story.e.a parama)
  {
    AppMethodBeat.i(110008);
    j.p(parama, "captureInfo");
    ab.i("MicroMsg.StoryCaptureUI", "prepareEditor, captureView:" + StoryCaptureUI.c(this.seH));
    StoryCaptureUI.a(this.seH, 2);
    Object localObject = StoryCaptureUI.c(this.seH);
    if (localObject != null)
      ((CaptureView)localObject).postDelayed((Runnable)new StoryCaptureUI.f.a(this), 50L);
    localObject = StoryCaptureUI.c(this.seH);
    if (localObject != null)
      ((CaptureView)localObject).lmr.stopPreview();
    localObject = StoryCaptureUI.d(this.seH);
    if (localObject != null)
      ((EditorView)localObject).setVisibility(0);
    localObject = StoryCaptureUI.d(this.seH);
    if (localObject != null)
      ((EditorView)localObject).setAlpha(0.0F);
    localObject = StoryCaptureUI.e(this.seH);
    if (localObject != null)
      ((c)localObject).a(parama);
    parama = h.scu;
    h.cAm().ba(System.currentTimeMillis());
    AppMethodBeat.o(110008);
  }

  public final void bnN()
  {
    AppMethodBeat.i(110007);
    StoryCaptureUI.a(this.seH, 0);
    Object localObject = StoryCaptureUI.c(this.seH);
    if (localObject != null)
      ((CaptureView)localObject).setVisibility(0);
    localObject = StoryCaptureUI.d(this.seH);
    if (localObject != null)
      ((EditorView)localObject).setVisibility(8);
    localObject = StoryCaptureUI.c(this.seH);
    if (localObject != null)
    {
      com.tencent.mm.media.widget.camerarecordview.a.a(((CaptureView)localObject).lmr);
      AppMethodBeat.o(110007);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110007);
    }
  }

  public final void bnO()
  {
    AppMethodBeat.i(110009);
    ab.i("MicroMsg.StoryCaptureUI", "onEditorPrepared, captureView:" + StoryCaptureUI.c(this.seH));
    StoryCaptureUI.a(this.seH, 1);
    EditorView localEditorView = StoryCaptureUI.d(this.seH);
    if (localEditorView != null)
    {
      localEditorView.setAlpha(1.0F);
      AppMethodBeat.o(110009);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110009);
    }
  }

  public final void exit()
  {
    AppMethodBeat.i(110010);
    this.seH.setResult(-1);
    this.seH.finish();
    AppMethodBeat.o(110010);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryCaptureUI.f
 * JD-Core Version:    0.6.2
 */