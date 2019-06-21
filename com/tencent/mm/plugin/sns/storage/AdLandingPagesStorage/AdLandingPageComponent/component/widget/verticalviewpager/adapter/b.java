package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class b extends k
{
  public List<Fragment> rdA;

  public b(i parami, List<Fragment> paramList)
  {
    super(parami);
    AppMethodBeat.i(37650);
    this.rdA = new ArrayList();
    this.rdA = paramList;
    AppMethodBeat.o(37650);
  }

  public final void a(Fragment paramFragment, int paramInt)
  {
    AppMethodBeat.i(37653);
    this.rdA.remove(paramFragment);
    if (paramInt >= this.rdA.size())
    {
      this.rdA.add(paramFragment);
      AppMethodBeat.o(37653);
    }
    while (true)
    {
      return;
      this.rdA.add(paramInt, paramFragment);
      AppMethodBeat.o(37653);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(37652);
    int i = this.rdA.size();
    AppMethodBeat.o(37652);
    return i;
  }

  public final Fragment getItem(int paramInt)
  {
    AppMethodBeat.i(37651);
    Fragment localFragment = (Fragment)this.rdA.get(paramInt);
    AppMethodBeat.o(37651);
    return localFragment;
  }

  public final CharSequence getPageTitle(int paramInt)
  {
    return "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b
 * JD-Core Version:    0.6.2
 */