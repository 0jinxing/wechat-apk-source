package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

public class EmojiStoreV2PersonFragment extends EmojiStoreV2BaseFragment
{
  private boolean ldT = false;

  public final a bkO()
  {
    AppMethodBeat.i(53663);
    com.tencent.mm.plugin.emoji.a.h localh = new com.tencent.mm.plugin.emoji.a.h(getContext());
    AppMethodBeat.o(53663);
    return localh;
  }

  public final int bkV()
  {
    return 9;
  }

  public final boolean bmd()
  {
    return false;
  }

  public int getLayoutId()
  {
    return 2130969368;
  }

  public void onAttach(Activity paramActivity)
  {
    AppMethodBeat.i(53653);
    super.onAttach(paramActivity);
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onAttach");
    AppMethodBeat.o(53653);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53654);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreate");
    AppMethodBeat.o(53654);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(53655);
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onCreateView");
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    AppMethodBeat.o(53655);
    return paramLayoutInflater;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53661);
    super.onDestroy();
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
    AppMethodBeat.o(53661);
  }

  public void onDestroyView()
  {
    AppMethodBeat.i(53660);
    super.onDestroyView();
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
    AppMethodBeat.o(53660);
  }

  public void onDetach()
  {
    AppMethodBeat.i(53662);
    super.onDetach();
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onDestroy");
    AppMethodBeat.o(53662);
  }

  public void onPause()
  {
    AppMethodBeat.i(53658);
    super.onPause();
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onPause");
    AppMethodBeat.o(53658);
  }

  public void onResume()
  {
    AppMethodBeat.i(53657);
    super.onResume();
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onResume");
    if (this.lcW != null)
      this.lcW.bmf();
    AppMethodBeat.o(53657);
  }

  public void onStart()
  {
    AppMethodBeat.i(53656);
    super.onStart();
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStart");
    AppMethodBeat.o(53656);
  }

  public void onStop()
  {
    AppMethodBeat.i(53659);
    super.onStop();
    ab.d("MicroMsg.emoji.EmojiStoreV2PersonFragment", "onStop");
    AppMethodBeat.o(53659);
  }

  public void setUserVisibleHint(boolean paramBoolean)
  {
    AppMethodBeat.i(53664);
    super.setUserVisibleHint(paramBoolean);
    if ((!this.ldT) && (paramBoolean))
    {
      this.ldT = true;
      com.tencent.mm.plugin.report.service.h.pYm.e(12740, new Object[] { Integer.valueOf(4), "", "", "", Integer.valueOf(2), Integer.valueOf(2) });
    }
    AppMethodBeat.o(53664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2PersonFragment
 * JD-Core Version:    0.6.2
 */