package com.tencent.mm.plugin.messenger;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.b.a.v;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bz;
import com.tencent.mm.openim.b.q;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.plugin.messenger.b.b.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ArrayList<Ljava.lang.CharSequence;>;
import java.util.Iterator;
import java.util.Map;

public class PluginMessenger extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.ai.f, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.messenger.a.c
{
  private ProgressDialog ehJ;
  private com.tencent.mm.plugin.messenger.a.e.a opA;
  private com.tencent.mm.plugin.messenger.a.e.a opB;
  private com.tencent.mm.plugin.messenger.a.e.a opC;
  private com.tencent.mm.plugin.messenger.a.e.a opD;
  private com.tencent.mm.plugin.messenger.a.e.a opE;
  private com.tencent.mm.plugin.messenger.foundation.a.o opF;
  private q opt;
  a opu;
  private com.tencent.mm.plugin.messenger.b.a opv;
  private e.b opw;
  private e.b opx;
  private e.b opy;
  private com.tencent.mm.plugin.messenger.a.e.a opz;

  public PluginMessenger()
  {
    AppMethodBeat.i(136891);
    this.ehJ = null;
    this.opu = new a();
    this.opv = new com.tencent.mm.plugin.messenger.b.a();
    this.opw = new PluginMessenger.1(this);
    this.opx = new PluginMessenger.6(this);
    this.opy = new PluginMessenger.7(this);
    this.opz = new PluginMessenger.8(this);
    this.opA = new PluginMessenger.9(this);
    this.opB = new PluginMessenger.10(this);
    this.opC = new PluginMessenger.11(this);
    this.opD = new PluginMessenger.12(this);
    this.opE = new com.tencent.mm.plugin.messenger.a.e.a()
    {
      public final String g(Map<String, String> paramAnonymousMap, String paramAnonymousString)
      {
        AppMethodBeat.i(136890);
        StringBuilder localStringBuilder1 = new StringBuilder();
        String str = bo.bc((String)paramAnonymousMap.get(paramAnonymousString + ".separator"), "、");
        int i = 0;
        StringBuilder localStringBuilder2 = new StringBuilder().append(paramAnonymousString).append(".memberlist.member");
        Object localObject;
        if (i != 0)
        {
          localObject = Integer.valueOf(i);
          label81: localObject = localObject;
          if (paramAnonymousMap.get(localObject) == null)
            break label185;
          if (i != 0)
            localStringBuilder1.append(str);
          localObject = (String)paramAnonymousMap.get((String)localObject + ".nickname");
          if (!bo.isNullOrNil((String)localObject))
            break label175;
          ab.w("MicroMsg.PluginMessenger", "hy: can not resolve username or nickname");
        }
        while (true)
        {
          i++;
          break;
          localObject = "";
          break label81;
          label175: localStringBuilder1.append((String)localObject);
        }
        label185: paramAnonymousMap = localStringBuilder1.toString();
        AppMethodBeat.o(136890);
        return paramAnonymousMap;
      }
    };
    this.opF = new PluginMessenger.2(this);
    AppMethodBeat.o(136891);
  }

  private CharSequence concactSpannable(ArrayList<CharSequence> paramArrayList)
  {
    AppMethodBeat.i(136900);
    Object localObject = new SpannableString("");
    if (paramArrayList == null)
      AppMethodBeat.o(136900);
    while (true)
    {
      return localObject;
      Iterator localIterator = paramArrayList.iterator();
      for (paramArrayList = (ArrayList<CharSequence>)localObject; localIterator.hasNext(); paramArrayList = TextUtils.concat(new CharSequence[] { paramArrayList, (CharSequence)localIterator.next() }));
      AppMethodBeat.o(136900);
      localObject = paramArrayList;
    }
  }

  private String getFirstSwitchContactTipsPrefsKey(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136904);
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, "");
    paramString1 = "FirstSwitchContactTips_" + paramString1 + "_" + paramString2 + "_" + str;
    AppMethodBeat.o(136904);
    return paramString1;
  }

  private String getSwitchContactPrefsKey(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136907);
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, "");
    paramString1 = "switch_contact_prefs_" + paramString1 + "_" + paramString2 + "_" + str;
    AppMethodBeat.o(136907);
    return paramString1;
  }

  private boolean isSwitchContact(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136909);
    boolean bool = ah.getContext().getSharedPreferences("switch_contact_prefs", 0).getBoolean(getSwitchContactPrefsKey(paramString1, paramString2), false);
    AppMethodBeat.o(136909);
    return bool;
  }

  private CharSequence nullAsNil(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(136899);
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      paramCharSequence = new SpannableString("");
      AppMethodBeat.o(136899);
    }
    while (true)
    {
      return paramCharSequence;
      AppMethodBeat.o(136899);
    }
  }

  private void resolvedSucceedContactText(Map<String, String> paramMap, String paramString1, Bundle paramBundle, WeakReference<Context> paramWeakReference, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(136892);
    String str1;
    int i;
    Object localObject1;
    String str2;
    String str3;
    String str4;
    Object localObject3;
    Object localObject4;
    ArrayList localArrayList;
    label398: b.a locala;
    int j;
    try
    {
      str1 = bo.bc(paramBundle.getString("local_session"), "");
      if ((paramWeakReference == null) || (paramWeakReference.get() == null))
        break label1124;
      paramBundle = new java/lang/StringBuilder;
      paramBundle.<init>();
      paramBundle = (String)paramMap.get(paramString1 + ".window_template.$type");
      i = bo.ank((String)paramMap.get(".sysmsg.sysmsgtemplate.content_template.succeed_scene"));
      if (!"tmpl_type_succeed_contact_window".equals(paramBundle))
        break label1124;
      paramBundle = new java/lang/StringBuilder;
      paramBundle.<init>();
      paramBundle = (String)paramMap.get(paramString1 + ".window_template.template");
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str2 = (String)paramMap.get(paramString1 + ".window_template.tp_username");
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = (String)paramMap.get(paramString1 + ".window_template.headimgurl");
      if ((!bo.isNullOrNil((String)localObject2)) && (com.tencent.mm.ah.o.act().qo(str2) == null))
      {
        localObject1 = new com/tencent/mm/ah/h;
        ((h)localObject1).<init>();
        ((h)localObject1).username = str2;
        ((h)localObject1).frV = ((String)localObject2);
        ((h)localObject1).dtR = 3;
        ((h)localObject1).cB(false);
        com.tencent.mm.ah.o.act().b((h)localObject1);
      }
      if ((paramBoolean) && (isSwitchContact(str2, paramString2)))
      {
        startChattingUI(str2);
        AppMethodBeat.o(136892);
        return;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str3 = (String)paramMap.get(paramString1 + ".window_template.ticket");
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str4 = (String)paramMap.get(paramString1 + ".window_template.antispam_ticket");
      localObject3 = "";
      localObject4 = "";
      paramBundle = com.tencent.mm.plugin.messenger.b.b.RF(paramBundle);
      if ((paramBundle == null) || (paramBundle.size() <= 0))
        break label1124;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = paramBundle.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label874;
        locala = (b.a)localIterator.next();
        if ((locala != null) && (locala.content != null))
        {
          if (locala.type != 0)
            break;
          paramBundle = new android/text/SpannableString;
          paramBundle.<init>(j.b(ah.getContext(), locala.content));
          localArrayList.add(paramBundle);
        }
      }
    }
    catch (Throwable paramMap)
    {
      do
        while (true)
          AppMethodBeat.o(136892);
      while (locala.type != 1);
      j = 0;
      localObject1 = localObject3;
      paramBundle = (Bundle)localObject4;
    }
    label498: Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = paramString1 + ".window_template.link_list.link";
    if (j != 0)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = (String)localObject2 + j;
    }
    while (true)
    {
      localObject4 = paramBundle;
      localObject3 = localObject1;
      if (bo.isNullOrNil((String)paramMap.get(localObject2)))
        break label398;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = (String)paramMap.get((String)localObject2 + ".$name");
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str5 = (String)paramMap.get((String)localObject2 + ".$type");
      if ((locala.content.equals(localObject4)) && ("link_plain".equals(str5)))
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localArrayList.add(nullAsNil((CharSequence)paramMap.get((String)localObject2 + ".plain")));
      }
      localObject3 = localObject1;
      if ("company".equals(localObject4))
      {
        localObject3 = localObject1;
        if ("link_userdescid".equals(str5))
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject3 = nullAsNil((CharSequence)paramMap.get((String)localObject2 + ".userdesc")).toString();
        }
      }
      if (("nickname".equals(localObject4)) && ("link_plain".equals(str5)))
      {
        paramBundle = new java/lang/StringBuilder;
        paramBundle.<init>();
        paramBundle = nullAsNil((CharSequence)paramMap.get((String)localObject2 + ".plain")).toString();
      }
      while (true)
      {
        j++;
        localObject1 = localObject3;
        break label498;
        label874: if (paramBoolean)
        {
          if (i == 1)
          {
            paramMap = new com/tencent/mm/g/b/a/v;
            paramMap.<init>();
            paramMap.eQ(str1);
            paramMap.eR(paramString2);
            paramMap.cXW = 1L;
            paramMap.cXX = 1L;
            paramMap.cXY = 3L;
            paramMap.ajK();
          }
          while (true)
          {
            showSwitchContactDialog((Context)paramWeakReference.get(), str1, concactSpannable(localArrayList).toString(), str2, str3, str4, (String)localObject4, (String)localObject3, paramString2);
            AppMethodBeat.o(136892);
            break;
            if (i == 0)
            {
              paramMap = new com/tencent/mm/g/b/a/v;
              paramMap.<init>();
              paramMap.eQ(str1);
              paramMap.eR(paramString2);
              paramMap.cXW = 1L;
              paramMap.cXX = 1L;
              paramMap.cXY = 2L;
              paramMap.ajK();
            }
          }
        }
        if (isFirstSwitchContactTips(str2, paramString2))
        {
          markFirstSwitchContactTips(str2, paramString2);
          paramMap = new com/tencent/mm/g/b/a/v;
          paramMap.<init>();
          paramMap.eQ(str1);
          paramMap.eR(paramString2);
          paramMap.cXW = 1L;
          paramMap.cXX = 1L;
          paramMap.cXY = 1L;
          paramMap.ajK();
          showSwitchContactDialog((Context)paramWeakReference.get(), str1, concactSpannable(localArrayList).toString(), str2, str3, str4, (String)localObject4, (String)localObject3, paramString2);
        }
        label1124: AppMethodBeat.o(136892);
        break;
      }
    }
  }

  private void saveSwitchContact(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136908);
    ah.getContext().getSharedPreferences("switch_contact_prefs", 0).edit().putBoolean(getSwitchContactPrefsKey(paramString1, paramString2), true).commit();
    AppMethodBeat.o(136908);
  }

  private void startChattingUI(String paramString)
  {
    AppMethodBeat.i(136902);
    ab.i("MicroMsg.PluginMessenger", "startChattingUI userName: ".concat(String.valueOf(paramString)));
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("Chat_Mode", 1);
    d.f(ah.getContext(), ".ui.chatting.ChattingUI", localIntent);
    AppMethodBeat.o(136902);
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(136895);
    if (paramg.SG())
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.messenger.a.b.class, this.opu);
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.messenger.a.e.class, this.opv);
    }
    AppMethodBeat.o(136895);
  }

  public void dependency()
  {
    AppMethodBeat.i(136894);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    AppMethodBeat.o(136894);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(136896);
    if (paramg.SG())
      pin(com.tencent.mm.plugin.v.a.ceU());
    AppMethodBeat.o(136896);
  }

  public void installed()
  {
    AppMethodBeat.i(136893);
    alias(com.tencent.mm.plugin.messenger.a.c.class);
    AppMethodBeat.o(136893);
  }

  public boolean isFirstSwitchContactTips(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136906);
    boolean bool = ah.getContext().getSharedPreferences("switch_contact_prefs", 0).getBoolean(getFirstSwitchContactTipsPrefsKey(paramString1, paramString2), true);
    AppMethodBeat.o(136906);
    return bool;
  }

  public void markFirstSwitchContactTips(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136905);
    ah.getContext().getSharedPreferences("switch_contact_prefs", 0).edit().putBoolean(getFirstSwitchContactTipsPrefsKey(paramString1, paramString2), false).commit();
    AppMethodBeat.o(136905);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(136897);
    paramc = this.opv;
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("sysmsgtemplate", paramc.oqZ);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_plain", this.opw);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_succeed_contact", this.opx);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_jump_chat", this.opy);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_plain", this.opz);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_succeed_contact", this.opA);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_jump_chat", this.opB);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_revoke", this.opC);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_revoke_qrcode", this.opD);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_profile", this.opE);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("secmsg", this.opF);
    com.tencent.mm.kernel.g.Rg().a(853, this);
    AppMethodBeat.o(136897);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(136898);
    com.tencent.mm.plugin.messenger.b.a locala = this.opv;
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("sysmsgtemplate", locala.oqZ);
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QB("link_plain");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QB("link_succeed_contact");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QB("link_jump_chat");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QC("link_plain");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QC("link_succeed_contact");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QC("link_jump_chat");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QC("link_revoke");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QC("link_revoke_qrcode");
    ((com.tencent.mm.plugin.messenger.a.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.e.class)).QC("link_profile");
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("secmsg", this.opF);
    com.tencent.mm.kernel.g.Rg().b(853, this);
    AppMethodBeat.o(136898);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(136901);
    try
    {
      if (com.tencent.mm.sdk.a.b.dnO())
        t.makeText(ah.getContext(), String.format("errType %s errCode %s errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString }), 1).show();
      if (paramm.getType() == 853)
      {
        if (this.ehJ != null)
        {
          this.ehJ.dismiss();
          this.ehJ = null;
        }
        if (paramm.equals(this.opt))
        {
          paramm = (q)paramm;
          if (paramInt2 == 0)
          {
            saveSwitchContact(paramm.geZ, paramm.gfj);
            startChattingUI(paramm.geZ);
          }
          paramString = new java/lang/StringBuilder;
          paramString.<init>("onSceneEnd VerifyOpenIMContact errCode: ");
          ab.w("MicroMsg.PluginMessenger", paramInt2 + " errType: " + paramInt1 + " userName: " + paramm.geZ + " ticket: " + paramm.gfi + " talkerUsername: " + paramm.gfj);
        }
      }
      AppMethodBeat.o(136901);
      return;
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.PluginMessenger", "onSceneEnd ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(136901);
      }
    }
  }

  public void showSwitchContactDialog(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    AppMethodBeat.i(136903);
    com.tencent.mm.ui.widget.a.e.a locala = new com.tencent.mm.ui.widget.a.e.a(paramContext);
    SwitchContactDialogCustomView localSwitchContactDialogCustomView = new SwitchContactDialogCustomView(paramContext);
    localSwitchContactDialogCustomView.setTilte(paramContext.getString(2131301891));
    localSwitchContactDialogCustomView.setContent(paramString2);
    localSwitchContactDialogCustomView.setDesc(paramString6);
    localSwitchContactDialogCustomView.setSubDesc("@".concat(String.valueOf(paramString7)));
    localSwitchContactDialogCustomView.setPhoto(paramString3);
    localSwitchContactDialogCustomView.setOnPhotoOnClick(new PluginMessenger.3(this, paramString3, paramString5, paramContext));
    paramString2 = locala.fo(localSwitchContactDialogCustomView).Qg(2131301890);
    paramString2.zQK = paramContext.getString(2131301888);
    paramString2.a(new PluginMessenger.4(this, paramString1, paramString8), new PluginMessenger.5(this, paramString3, paramString1, paramString8, paramString4, paramContext)).show();
    AppMethodBeat.o(136903);
  }

  public String toString()
  {
    return "plugin-messenger";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.PluginMessenger
 * JD-Core Version:    0.6.2
 */