package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.au.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;

public class RegByMobileVoiceVerifySelectUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private LanguagePreference.a[] gGM;
  private String gGN;

  private static LanguagePreference.a[] arv()
  {
    AppMethodBeat.i(125460);
    String[] arrayOfString1 = ah.getContext().getString(2131297591).trim().split(",");
    LanguagePreference.a[] arrayOfa = new LanguagePreference.a[arrayOfString1.length];
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String[] arrayOfString2 = arrayOfString1[i].trim().split(":");
      arrayOfa[i] = new LanguagePreference.a(arrayOfString2[1], arrayOfString2[2], arrayOfString2[0], false);
    }
    AppMethodBeat.o(125460);
    return arrayOfa;
  }

  public static String wx(String paramString)
  {
    AppMethodBeat.i(125459);
    LanguagePreference.a[] arrayOfa = arv();
    paramString = b.sN(paramString);
    int i = arrayOfa.length;
    int j = 0;
    if (j < i)
    {
      LanguagePreference.a locala = arrayOfa[j];
      if (locala.gBE.equalsIgnoreCase(paramString))
      {
        paramString = locala.gBC;
        AppMethodBeat.o(125459);
      }
    }
    while (true)
    {
      return paramString;
      j++;
      break;
      paramString = "English";
      AppMethodBeat.o(125459);
    }
  }

  public final int JC()
  {
    return 2130968845;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(125457);
    if ((paramPreference instanceof LanguagePreference))
    {
      paramPreference = ((LanguagePreference)paramPreference).gBB;
      if (paramPreference == null)
        AppMethodBeat.o(125457);
    }
    while (true)
    {
      return bool;
      paramf = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("voice_verify_language", paramPreference.gBC);
      localBundle.putString("voice_verify_code", paramPreference.gBE);
      paramf.putExtras(localBundle);
      setResult(0, paramf);
      finish();
      bool = true;
      AppMethodBeat.o(125457);
      continue;
      AppMethodBeat.o(125457);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(125458);
    aqX();
    this.gGN = getIntent().getExtras().getString("voice_verify_code");
    setMMTitle(2131297597);
    setBackBtn(new RegByMobileVoiceVerifySelectUI.1(this));
    this.gGM = arv();
    if ((this.gGM == null) || (this.gGM.length <= 0))
      AppMethodBeat.o(125458);
    while (true)
    {
      return;
      this.ehK.removeAll();
      Object localObject = new PreferenceCategory(this);
      this.ehK.b((Preference)localObject);
      for (LanguagePreference.a locala : this.gGM)
      {
        if (locala.gBE.equalsIgnoreCase(this.gGN))
          locala.gBF = true;
        localObject = new LanguagePreference(this);
        ((LanguagePreference)localObject).a(locala);
        ((LanguagePreference)localObject).setKey(locala.gBE);
        this.ehK.b((Preference)localObject);
      }
      AppMethodBeat.o(125458);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125455);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    initView();
    AppMethodBeat.o(125455);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125456);
    super.onDestroy();
    AppMethodBeat.o(125456);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI
 * JD-Core Version:    0.6.2
 */