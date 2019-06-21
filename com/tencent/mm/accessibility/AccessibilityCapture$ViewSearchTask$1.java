package com.tencent.mm.accessibility;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

class AccessibilityCapture$ViewSearchTask$1
  implements ViewSearchTool.Matcher
{
  AccessibilityCapture$ViewSearchTask$1(AccessibilityCapture.ViewSearchTask paramViewSearchTask, int paramInt)
  {
  }

  public boolean match(View paramView)
  {
    AppMethodBeat.i(118626);
    try
    {
      if (((Integer)AccessibilityCapture.access$900().get(paramView)).intValue() == this.val$id)
      {
        bool = true;
        AppMethodBeat.o(118626);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(118626);
        bool = false;
      }
    }
    catch (IllegalAccessException paramView)
    {
      while (true)
      {
        AppMethodBeat.o(118626);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.AccessibilityCapture.ViewSearchTask.1
 * JD-Core Version:    0.6.2
 */