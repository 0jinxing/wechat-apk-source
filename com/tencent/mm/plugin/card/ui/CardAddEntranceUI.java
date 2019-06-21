package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp;
import com.tencent.mm.plugin.card.d.h;
import com.tencent.mm.plugin.card.model.e;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.protocal.protobuf.nx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a(3)
public class CardAddEntranceUI extends MMActivity
{
  private String appId;
  private int cME;
  private String kiA;
  private String kiB;
  private int kiC;
  LinkedList<nx> kip;

  public CardAddEntranceUI()
  {
    AppMethodBeat.i(88246);
    this.kip = new LinkedList();
    this.kiA = "";
    this.cME = 8;
    this.kiC = 0;
    AppMethodBeat.o(88246);
  }

  private void aq(int paramInt, String paramString)
  {
    AppMethodBeat.i(88250);
    Bundle localBundle = new Bundle();
    localBundle.putString("_wxapi_add_card_to_wx_card_list", paramString);
    Object localObject = g.bT(this.appId, true);
    AddCardToWXCardPackage.Resp localResp = new AddCardToWXCardPackage.Resp(localBundle);
    if (localObject != null)
      localResp.openId = ((f)localObject).field_openId;
    localResp.transaction = this.kiB;
    String str = this.appId;
    if (localObject == null)
    {
      paramString = "null appinfo";
      if (localObject != null)
        break label202;
      localObject = "null appinfo";
      label87: ab.i("MicroMsg.CardAddEntranceUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", new Object[] { str, paramString, localObject, this.kiB });
      localResp.toBundle(localBundle);
      ab.i("MicroMsg.CardAddEntranceUI", "setResultToSDK result:".concat(String.valueOf(paramInt)));
      if (paramInt != -1)
        break label212;
    }
    label202: label212: for (localResp.errCode = 0; ; localResp.errCode = -2)
    {
      paramString = new MMessageActV2.Args();
      paramString.targetPkgName = this.kiA;
      paramString.bundle = localBundle;
      p.at(localBundle);
      p.au(localBundle);
      MMessageActV2.send(ah.getContext(), paramString);
      AppMethodBeat.o(88250);
      return;
      paramString = ((f)localObject).field_appName;
      break;
      localObject = ((f)localObject).field_openId;
      break label87;
    }
  }

  public final int getLayoutId()
  {
    return 2130968895;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(88249);
    ab.v("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onActivityResult");
    if (paramInt2 == -1)
      ab.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_OK");
    LinkedList localLinkedList;
    Object localObject1;
    Object localObject2;
    while (true)
    {
      localLinkedList = new LinkedList();
      localObject1 = this.kip.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (nx)((Iterator)localObject1).next();
        e locale = new e();
        locale.kbU = ((nx)localObject2).kbU;
        locale.cMD = ((nx)localObject2).cMD;
        localLinkedList.add(locale);
      }
      ab.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_CANCELED");
    }
    if (paramInt1 == 1)
    {
      ab.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_DETAIL");
      if ((this.cME == 7) || (this.cME == 16))
      {
        localObject1 = new Intent();
        switch (paramInt2)
        {
        default:
        case -1:
        case 0:
        }
      }
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(88249);
      return;
      if ((paramIntent != null) && (localLinkedList.size() > 0))
        ((e)localLinkedList.get(0)).code = paramIntent.getStringExtra("key_code");
      ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, true, this.cME));
      setResult(-1, (Intent)localObject1);
      continue;
      ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, false, this.cME));
      setResult(0, (Intent)localObject1);
      continue;
      if (this.cME == 26)
      {
        localObject1 = new Intent();
        switch (paramInt2)
        {
        default:
          break;
        case -1:
          if ((paramIntent != null) && (localLinkedList.size() > 0))
            ((e)localLinkedList.get(0)).code = paramIntent.getStringExtra("key_code");
          ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, true, this.cME));
          setResult(-1, (Intent)localObject1);
          break;
        case 0:
          ((Intent)localObject1).putExtra("card_list", h.a(localLinkedList, false, this.cME));
          setResult(0, (Intent)localObject1);
          break;
        }
      }
      else
      {
        switch (paramInt2)
        {
        default:
          break;
        case -1:
          if ((paramIntent != null) && (localLinkedList.size() > 0))
            ((e)localLinkedList.get(0)).code = paramIntent.getStringExtra("key_code");
          aq(-1, h.a(localLinkedList, true, this.cME));
          break;
        case 0:
          aq(0, h.a(localLinkedList, false, this.cME));
          continue;
          if (paramInt1 == 2)
          {
            ab.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_ACCEPT_CARD_LIST");
            localObject1 = "";
            if (paramIntent != null)
              localObject1 = paramIntent.getStringExtra("card_list");
            if ((this.cME == 7) || (this.cME == 16))
              localObject2 = new Intent();
            switch (paramInt2)
            {
            default:
              break;
            case -1:
              if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
              {
                paramIntent.putExtra("card_list", h.bQ((String)localObject1, this.cME));
                setResult(-1, paramIntent);
              }
              else
              {
                ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, true, this.cME));
                setResult(-1, (Intent)localObject2);
              }
              break;
            case 0:
              if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
              {
                paramIntent.putExtra("card_list", h.bQ((String)localObject1, this.cME));
                setResult(0, paramIntent);
              }
              else
              {
                ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, false, this.cME));
                ((Intent)localObject2).putExtra("result_code", 1);
                setResult(0, (Intent)localObject2);
                continue;
                if (this.cME == 26)
                {
                  localObject2 = new Intent();
                  switch (paramInt2)
                  {
                  default:
                    break;
                  case -1:
                    if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
                    {
                      paramIntent.putExtra("card_list", h.bQ((String)localObject1, this.cME));
                      setResult(-1, paramIntent);
                      continue;
                    }
                    ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, true, this.cME));
                    setResult(-1, (Intent)localObject2);
                    break;
                  case 0:
                    if ((paramIntent != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
                    {
                      paramIntent.putExtra("card_list", h.bQ((String)localObject1, this.cME));
                      setResult(0, paramIntent);
                      continue;
                    }
                    ((Intent)localObject2).putExtra("card_list", h.a(localLinkedList, false, this.cME));
                    ((Intent)localObject2).putExtra("result_code", 1);
                    setResult(0, (Intent)localObject2);
                    break;
                  }
                }
                else
                {
                  switch (paramInt2)
                  {
                  default:
                    break;
                  case -1:
                    if (!TextUtils.isEmpty((CharSequence)localObject1))
                      aq(-1, (String)localObject1);
                    else
                      aq(-1, h.a(localLinkedList, true, this.cME));
                    break;
                  case 0:
                    if (!TextUtils.isEmpty((CharSequence)localObject1))
                      aq(0, (String)localObject1);
                    else
                      aq(0, h.a(localLinkedList, false, this.cME));
                    break;
                  }
                }
              }
              break;
            }
          }
          break;
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88247);
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      ab.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onCreate() intent == null");
      setResult(0);
      finish();
      AppMethodBeat.o(88247);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI doRediect() handle data");
      String str1 = localIntent.getStringExtra("key_in_card_list");
      this.cME = localIntent.getIntExtra("key_from_scene", 8);
      this.kiC = localIntent.getIntExtra("key_stastic_scene", 0);
      ab.i("MicroMsg.CardAddEntranceUI", "doRediect() from_scene:" + this.cME + "  from_origin_scene:" + this.kiC);
      this.kiA = localIntent.getStringExtra("key_package_name");
      Object localObject = localIntent.getStringExtra("key_sign");
      String str2 = getIntent().getStringExtra("src_username");
      ab.i("MicroMsg.CardAddEntranceUI", "doRediect() src_username:".concat(String.valueOf(str2)));
      String str3 = getIntent().getStringExtra("js_url");
      this.appId = getIntent().getStringExtra("key_app_id");
      this.kiB = getIntent().getStringExtra("key_transaction");
      String str4 = getIntent().getStringExtra("key_consumed_card_id");
      ab.i("MicroMsg.CardAddEntranceUI", "doRediect() consumedCardId:".concat(String.valueOf(str4)));
      String str5 = getIntent().getStringExtra("key_template_id");
      ArrayList localArrayList = h.bP(str1, this.cME);
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        ab.e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI initView () tempList == null || tempList.size() == 0");
        setResult(0);
        finish();
        AppMethodBeat.o(88247);
      }
      else
      {
        this.kip.clear();
        this.kip.addAll(localArrayList);
        paramBundle = new Intent();
        paramBundle.putExtra("key_from_scene", this.cME);
        paramBundle.putExtra("key_stastic_scene", this.kiC);
        if (localArrayList.size() == 1)
        {
          localObject = (nx)localArrayList.get(0);
          paramBundle.putExtra("key_card_id", ((nx)localObject).kbU);
          paramBundle.putExtra("key_card_ext", ((nx)localObject).cMD);
          paramBundle.putExtra("src_username", str2);
          paramBundle.putExtra("js_url", str3);
          paramBundle.putExtra("key_consumed_card_id", str4);
          paramBundle.putExtra("key_template_id", str5);
          paramBundle.putExtra("key_from_appbrand_type", localIntent.getIntExtra("key_from_appbrand_type", 0));
          paramBundle.setClass(this, CardDetailUI.class);
          startActivityForResult(paramBundle, 1);
          AppMethodBeat.o(88247);
        }
        else
        {
          paramBundle.putExtra("key_in_card_list", str1);
          paramBundle.putExtra("key_package_name", this.kiA);
          paramBundle.putExtra("key_sign", (String)localObject);
          paramBundle.putExtra("src_username", str2);
          paramBundle.putExtra("js_url", str3);
          paramBundle.putExtra("key_consumed_card_id", str4);
          paramBundle.putExtra("key_template_id", str5);
          paramBundle.setClass(this, CardAcceptCardListUI.class);
          startActivityForResult(paramBundle, 2);
          AppMethodBeat.o(88247);
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88248);
    super.onDestroy();
    AppMethodBeat.o(88248);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardAddEntranceUI
 * JD-Core Version:    0.6.2
 */