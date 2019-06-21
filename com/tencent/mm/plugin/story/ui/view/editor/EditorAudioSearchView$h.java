package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bd;
import com.tencent.mm.plugin.story.model.audio.b;
import com.tencent.mm.plugin.story.model.audio.b.a;
import com.tencent.mm.plugin.story.ui.a.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "textView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "keyEvent", "Landroid/view/KeyEvent;", "onEditorAction"})
final class EditorAudioSearchView$h
  implements TextView.OnEditorActionListener
{
  EditorAudioSearchView$h(EditorAudioSearchView paramEditorAudioSearchView)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(110481);
    if (3 == paramInt)
    {
      if (EditorAudioSearchView.h(this.skR) != null)
      {
        String str = EditorAudioSearchView.h(this.skR);
        j.o(paramTextView, "textView");
        paramKeyEvent = paramTextView.getText();
        if (paramKeyEvent == null)
          break label341;
        paramKeyEvent = paramKeyEvent.toString();
        if (!bo.isEqual(str, paramKeyEvent))
        {
          EditorAudioSearchView.f(this.skR);
          paramKeyEvent = b.rUx;
          b.cyT().cH(2L);
          paramKeyEvent = b.rUx;
          b.a.cyU();
          paramKeyEvent = b.rUx;
          b.cyT().cK(this.skR.getMRelatedRecId());
        }
      }
      paramKeyEvent = this.skR;
      j.o(paramTextView, "textView");
      paramTextView = paramTextView.getText();
      if (paramTextView == null)
        break label346;
    }
    label341: label346: for (paramTextView = paramTextView.toString(); ; paramTextView = null)
    {
      EditorAudioSearchView.a(paramKeyEvent, paramTextView);
      if (!bo.isNullOrNil(EditorAudioSearchView.h(this.skR)))
      {
        paramTextView = EditorAudioSearchView.c(this.skR);
        if (paramTextView != null)
          paramTextView.setSelection(null);
        paramTextView = EditorAudioSearchView.c(this.skR);
        if (paramTextView != null)
          paramTextView.setSelection(null);
        paramTextView = EditorAudioSearchView.i(this.skR);
        if (paramTextView != null)
          paramTextView.bY(0);
        paramTextView = EditorAudioSearchView.c(this.skR);
        if (paramTextView != null)
          paramTextView.dG((List)new LinkedList());
        paramTextView = EditorAudioSearchView.j(this.skR);
        if (paramTextView != null)
          paramTextView.setEnabled(false);
        EditorAudioSearchView.a(this.skR, 0L);
        EditorAudioSearchView.e(this.skR);
        EditorAudioSearchView.a(this.skR, 0);
        paramTextView = EditorAudioSearchView.c(this.skR);
        if (paramTextView != null)
          paramTextView.sfv = EditorAudioSearchView.h(this.skR);
        EditorAudioSearchView.m(this.skR);
        EditorAudioSearchView.n(this.skR);
        EditorAudioSearchView.o(this.skR);
        EditorAudioSearchView.b(this.skR, false);
        paramTextView = this.skR.getCallback();
        if (paramTextView != null)
          paramTextView.cCv();
      }
      AppMethodBeat.o(110481);
      return false;
      paramKeyEvent = null;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioSearchView.h
 * JD-Core Version:    0.6.2
 */