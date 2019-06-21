package com.tencent.mm.ui.chatting.g;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.bp.d.b;
import com.tencent.mm.ui.chatting.d.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

public final class b
  implements d.b
{
  private static WeakHashMap<Fragment, HashMap<Integer, d.a>> yYM;
  private WeakReference<a> yYN;

  static
  {
    AppMethodBeat.i(32501);
    yYM = new WeakHashMap();
    AppMethodBeat.o(32501);
  }

  public b(a parama)
  {
    AppMethodBeat.i(32495);
    this.yYN = new WeakReference(parama);
    AppMethodBeat.o(32495);
  }

  private static void a(Fragment paramFragment, int paramInt, d.a parama)
  {
    AppMethodBeat.i(32497);
    HashMap localHashMap1 = (HashMap)yYM.get(paramFragment);
    HashMap localHashMap2 = localHashMap1;
    if (localHashMap1 == null)
    {
      localHashMap2 = new HashMap();
      yYM.put(paramFragment, localHashMap2);
    }
    localHashMap2.put(Integer.valueOf(paramInt), parama);
    AppMethodBeat.o(32497);
  }

  public static d.a b(Fragment paramFragment, int paramInt)
  {
    AppMethodBeat.i(32496);
    paramFragment = (HashMap)yYM.get(paramFragment);
    if (paramFragment != null)
    {
      paramFragment = (d.a)paramFragment.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(32496);
    }
    while (true)
    {
      return paramFragment;
      paramFragment = null;
      AppMethodBeat.o(32496);
    }
  }

  public final void a(Intent paramIntent, int paramInt, d.a parama)
  {
    AppMethodBeat.i(32499);
    Fragment localFragment = getFragment();
    if (localFragment == null)
      AppMethodBeat.o(32499);
    while (true)
    {
      return;
      a(localFragment, paramInt, parama);
      localFragment.startActivityForResult(paramIntent, paramInt);
      AppMethodBeat.o(32499);
    }
  }

  public final Context getContext()
  {
    AppMethodBeat.i(32500);
    FragmentActivity localFragmentActivity = getFragment().getActivity();
    AppMethodBeat.o(32500);
    return localFragmentActivity;
  }

  public final Fragment getFragment()
  {
    AppMethodBeat.i(32498);
    Object localObject = (a)this.yYN.get();
    if (localObject != null)
    {
      localObject = ((a)localObject).yTx;
      AppMethodBeat.o(32498);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(32498);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.g.b
 * JD-Core Version:    0.6.2
 */