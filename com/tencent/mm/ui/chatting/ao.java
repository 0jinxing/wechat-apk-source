package com.tencent.mm.ui.chatting;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ao
{
  private static LinkedList<View> yMJ;
  private static LinkedList<View> yMK;
  private static LinkedList<View> yML;

  static
  {
    AppMethodBeat.i(70052);
    yMJ = new LinkedList();
    yMK = new LinkedList();
    yML = new LinkedList();
    AppMethodBeat.o(70052);
  }

  public static View Ot(int paramInt)
  {
    AppMethodBeat.i(70049);
    Object localObject;
    if (paramInt == 1)
    {
      localObject = yMJ;
      if (((LinkedList)localObject).size() == 0)
        break label55;
      localObject = (View)((LinkedList)localObject).removeFirst();
      AppMethodBeat.o(70049);
    }
    while (true)
    {
      return localObject;
      if (paramInt == 2)
      {
        localObject = yMK;
        break;
      }
      localObject = yML;
      break;
      label55: localObject = null;
      AppMethodBeat.o(70049);
    }
  }

  public static void aj(View paramView, int paramInt)
  {
    AppMethodBeat.i(70050);
    LinkedList localLinkedList;
    if (paramInt == 1)
      localLinkedList = yMJ;
    while (true)
    {
      if (localLinkedList.size() >= 35)
        localLinkedList.removeFirst();
      localLinkedList.addLast(paramView);
      AppMethodBeat.o(70050);
      return;
      if (paramInt == 2)
        localLinkedList = yMK;
      else
        localLinkedList = yML;
    }
  }

  public static void clear()
  {
    AppMethodBeat.i(70051);
    yMJ.clear();
    yMK.clear();
    yML.clear();
    AppMethodBeat.o(70051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ao
 * JD-Core Version:    0.6.2
 */