package com.tencent.mm.ui.chatting.c;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aa;
import com.tencent.mm.ui.chatting.c.b.ad;
import com.tencent.mm.ui.chatting.c.b.ai;
import com.tencent.mm.ui.chatting.c.b.b;
import com.tencent.mm.ui.chatting.d.a;

final class n$1$1
  implements View.OnDragListener
{
  n$1$1(n.1 param1)
  {
  }

  public final boolean onDrag(View paramView, DragEvent paramDragEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(31386);
    boolean bool2;
    switch (paramDragEvent.getAction())
    {
    default:
      ab.e("MicroMsg.ChattingUI.DragDropComponent", "Unknown action type received by OnDragListener.");
      bool2 = false;
    case 1:
    case 5:
    case 2:
    case 4:
    case 3:
    }
    int i;
    int j;
    do
    {
      do
      {
        while (true)
        {
          AppMethodBeat.o(31386);
          return bool2;
          ab.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_STARTED");
          bool2 = bool1;
          continue;
          ab.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENTERED");
          bool2 = bool1;
          continue;
          ab.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_LOCATION");
          bool2 = bool1;
          continue;
          ab.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENDED");
          bool2 = bool1;
        }
        ab.i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DROP");
        paramView = paramDragEvent.getClipData();
        bool2 = bool1;
      }
      while (paramView == null);
      i = paramView.getItemCount();
      j = 0;
      bool2 = bool1;
    }
    while (j >= i);
    paramDragEvent = paramView.getItemAt(j);
    if (paramDragEvent == null)
      ab.e("MicroMsg.ChattingUI.DragDropComponent", "item == null");
    while (true)
    {
      j++;
      break;
      if (paramDragEvent.getIntent() != null)
      {
        this.yPz.yPy.cgL.yTx.startActivity(paramDragEvent.getIntent());
      }
      else if (paramDragEvent.getUri() != null)
      {
        Object localObject = new o(this.yPz.yPy.cgL.yTx.getContext(), paramDragEvent.getUri());
        if ((((o)localObject).fileType != 0) && (((o)localObject).filePath != null));
        switch (((o)localObject).fileType)
        {
        default:
          ((b)this.yPz.yPy.cgL.aF(b.class)).a((o)localObject);
          break;
        case 3:
          paramDragEvent = ((o)localObject).filePath;
          bool2 = r.g(paramDragEvent, this.yPz.yPy.cgL.getTalkerUserName(), true);
          localObject = (aa)this.yPz.yPy.cgL.aF(aa.class);
          if (bool2);
          for (int k = 1; ; k = 0)
          {
            ((aa)localObject).B(k, 0, paramDragEvent);
            break;
          }
        case 4:
          localObject = new Intent();
          ((Intent)localObject).setData(paramDragEvent.getUri());
          ((ai)this.yPz.yPy.cgL.aF(ai.class)).ai((Intent)localObject);
          continue;
          ab.e("MicroMsg.ChattingUI.DragDropComponent", "get file path failed");
          break;
        }
      }
      else if ((paramDragEvent.getText() != null) && (paramDragEvent.getText().length() > 0))
      {
        ((ad)this.yPz.yPy.cgL.aF(ad.class)).arq(paramDragEvent.getText().toString());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.n.1.1
 * JD-Core Version:    0.6.2
 */