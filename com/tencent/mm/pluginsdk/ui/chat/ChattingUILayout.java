package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import java.util.ArrayList;
import java.util.List;

public class ChattingUILayout extends BasePanelKeybordLayout
{
  private ChatFooterBottom vol;

  public ChattingUILayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private ChatFooterBottom t(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(27946);
    if (this.vol != null)
    {
      paramViewGroup = this.vol;
      AppMethodBeat.o(27946);
    }
    while (true)
    {
      return paramViewGroup;
      if ((paramViewGroup == null) || (paramViewGroup.getChildCount() <= 0))
      {
        paramViewGroup = this.vol;
        AppMethodBeat.o(27946);
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= paramViewGroup.getChildCount())
            break label134;
          View localView = paramViewGroup.getChildAt(i);
          if ((localView instanceof ChatFooterBottom))
          {
            this.vol = ((ChatFooterBottom)localView);
            paramViewGroup = this.vol;
            AppMethodBeat.o(27946);
            break;
          }
          if (((localView instanceof ViewGroup)) && (t((ViewGroup)localView) != null))
          {
            paramViewGroup = this.vol;
            AppMethodBeat.o(27946);
            break;
          }
        }
        label134: paramViewGroup = this.vol;
        AppMethodBeat.o(27946);
      }
    }
  }

  public List<View> getPanelView()
  {
    AppMethodBeat.i(27947);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(t(this));
    AppMethodBeat.o(27947);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChattingUILayout
 * JD-Core Version:    0.6.2
 */