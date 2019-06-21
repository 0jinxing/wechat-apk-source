package com.facebook.appevents.codeless;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class CodelessMatcher$MatchedView
{
  private WeakReference<View> view;
  private String viewMapKey;

  public CodelessMatcher$MatchedView(View paramView, String paramString)
  {
    AppMethodBeat.i(72048);
    this.view = new WeakReference(paramView);
    this.viewMapKey = paramString;
    AppMethodBeat.o(72048);
  }

  public View getView()
  {
    AppMethodBeat.i(72049);
    View localView;
    if (this.view == null)
    {
      localView = null;
      AppMethodBeat.o(72049);
    }
    while (true)
    {
      return localView;
      localView = (View)this.view.get();
      AppMethodBeat.o(72049);
    }
  }

  public String getViewMapKey()
  {
    return this.viewMapKey;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.CodelessMatcher.MatchedView
 * JD-Core Version:    0.6.2
 */