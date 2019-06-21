package com.tencent.mm.ui.chatting;

import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.IChattingUIProxy;
import com.tencent.mm.ui.MMFragmentActivity;
import java.util.Iterator;
import java.util.List;

public final class y
  implements IChattingUIProxy
{
  private MMFragmentActivity iWA;
  private BaseChattingUIFragment ypn;

  public y(MMFragmentActivity paramMMFragmentActivity, BaseChattingUIFragment paramBaseChattingUIFragment)
  {
    this.ypn = paramBaseChattingUIFragment;
    this.iWA = paramMMFragmentActivity;
  }

  public final void onEnterBegin()
  {
    AppMethodBeat.i(30912);
    ab.i("MicroMsg.ChattingUIProxy", "[onEnterBegin]");
    this.ypn.dBE();
    this.ypn.onEnterBegin();
    this.ypn.dBF();
    AppMethodBeat.o(30912);
  }

  public final void onEnterEnd()
  {
    AppMethodBeat.i(30913);
    ab.i("MicroMsg.ChattingUIProxy", "[onEnterEnd]");
    if (this.ypn.Oe(256))
    {
      this.ypn.dBG();
      this.ypn.onEnterEnd();
    }
    AppMethodBeat.o(30913);
  }

  public final void onExitBegin()
  {
    AppMethodBeat.i(30914);
    ab.i("MicroMsg.ChattingUIProxy", "[onExitBegin]");
    if (!this.ypn.dBM())
      this.ypn.onExitBegin();
    AppMethodBeat.o(30914);
  }

  public final void onExitEnd()
  {
    AppMethodBeat.i(30915);
    ab.i("MicroMsg.ChattingUIProxy", "[onExitEnd]");
    this.ypn.dBH();
    this.ypn.dBI();
    this.ypn.dBJ();
    this.ypn.onExitEnd();
    AppMethodBeat.o(30915);
  }

  public final void onInit(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(30911);
    this.ypn.yHj = true;
    Object localObject = this.iWA.getSupportFragmentManager().getFragments();
    label36: boolean bool;
    if (localObject == null)
    {
      ab.i("MicroMsg.ChattingUIProxy", "fragments is null");
      break label170;
      bool = true;
      label39: ab.i("MicroMsg.ChattingUIProxy", "[onInit] isPreload：%s ok:%s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
      if (!bool)
        break label233;
      this.iWA.getSupportFragmentManager().beginTransaction().a(paramInt, this.ypn).commitAllowingStateLoss();
      this.iWA.getSupportFragmentManager().executePendingTransactions();
    }
    while (true)
    {
      if (paramBoolean)
      {
        onExitBegin();
        onExitEnd();
      }
      this.ypn.yHj = false;
      AppMethodBeat.o(30911);
      return;
      if (((List)localObject).size() >= 5)
      {
        ab.e("MicroMsg.ChattingUIProxy", "fragments more than 5! %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
        localObject = ((List)localObject).iterator();
        label170: if (!((Iterator)localObject).hasNext())
          break label36;
        if (!((Fragment)((Iterator)localObject).next() instanceof ChattingUIFragment))
          break;
        ab.e("MicroMsg.ChattingUIProxy", "fragments more than 5 and find a ChattingUIFragment!!");
        bool = false;
        break label39;
      }
      ab.i("MicroMsg.ChattingUIProxy", "fragments size %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      break label36;
      label233: this.iWA.getSupportFragmentManager().beginTransaction().b(paramInt, this.ypn).commitAllowingStateLoss();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.y
 * JD-Core Version:    0.6.2
 */