package com.tencent.mm.plugin.voip.a;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  public int mState;
  private Map<Integer, Map<Integer, Integer>> sZi;

  public c(int paramInt)
  {
    this.mState = paramInt;
  }

  public final boolean GQ(int paramInt)
  {
    AppMethodBeat.i(5005);
    boolean bool;
    if ((this.sZi == null) || (!this.sZi.containsKey(Integer.valueOf(this.mState))))
    {
      ab.e("MicroMsg.Voip.VoipStateMachine", "no rule for state: %s", new Object[] { b.GK(this.mState) });
      AppMethodBeat.o(5005);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!((Map)this.sZi.get(Integer.valueOf(this.mState))).containsKey(Integer.valueOf(paramInt)))
      {
        ab.e("MicroMsg.Voip.VoipStateMachine", "state: %s don't contain rule for action: %s", new Object[] { b.GK(this.mState), b.GK(paramInt) });
        AppMethodBeat.o(5005);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(5005);
        bool = true;
      }
    }
  }

  public final void GR(int paramInt)
  {
    AppMethodBeat.i(5006);
    if (!GQ(paramInt))
    {
      ab.e("MicroMsg.Voip.VoipStateMachine", "can't tranform due to no such rule");
      AppMethodBeat.o(5006);
    }
    while (true)
    {
      return;
      int i = ((Integer)((Map)this.sZi.get(Integer.valueOf(this.mState))).get(Integer.valueOf(paramInt))).intValue();
      ab.d("MicroMsg.Voip.VoipStateMachine", "from oldState: %s to newState: %s, action: %s", new Object[] { b.GK(this.mState), b.GK(i), b.GK(paramInt) });
      this.mState = i;
      AppMethodBeat.o(5006);
    }
  }

  @SuppressLint({"UseSparseArrays"})
  public final void al(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(5004);
    if (this.sZi == null)
      this.sZi = new HashMap();
    Object localObject;
    if (!this.sZi.containsKey(Integer.valueOf(paramInt1)))
    {
      localObject = new HashMap();
      this.sZi.put(Integer.valueOf(paramInt1), localObject);
    }
    while (true)
    {
      ((Map)localObject).put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
      AppMethodBeat.o(5004);
      return;
      localObject = (Map)this.sZi.get(Integer.valueOf(paramInt1));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.a.c
 * JD-Core Version:    0.6.2
 */