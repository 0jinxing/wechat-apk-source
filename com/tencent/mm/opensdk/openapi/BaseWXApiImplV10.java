package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.channel.a.a.a;
import com.tencent.mm.opensdk.channel.a.b;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp;
import com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage.Resp;
import com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp;
import com.tencent.mm.opensdk.modelbiz.HandleScanResult.Resp;
import com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp;
import com.tencent.mm.opensdk.modelbiz.OpenWebview.Resp;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Req;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Resp;
import com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg.Req;
import com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg.Resp;
import com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert.Req;
import com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert.Resp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Req;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Resp;
import com.tencent.mm.opensdk.modelbiz.WXNontaxPay.Req;
import com.tencent.mm.opensdk.modelbiz.WXNontaxPay.Resp;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Req;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Req;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Resp;
import com.tencent.mm.opensdk.modelbiz.WXPayInsurance.Req;
import com.tencent.mm.opensdk.modelbiz.WXPayInsurance.Resp;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.LaunchFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.modelpay.JumpToOfflinePay.Resp;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.opensdk.utils.ILog;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

class BaseWXApiImplV10
  implements IWXAPI
{
  protected static final String TAG = "MicroMsg.SDK.WXApiImplV10";
  private static String wxappPayEntryClassname = null;
  protected String appId;
  protected boolean checkSignature;
  protected Context context;
  protected boolean detached;
  private int wxSdkVersion;

  BaseWXApiImplV10(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(128102);
    this.checkSignature = false;
    this.detached = false;
    Log.d("MicroMsg.SDK.WXApiImplV10", "<init>, appId = " + paramString + ", checkSignature = " + paramBoolean);
    this.context = paramContext;
    this.appId = paramString;
    this.checkSignature = paramBoolean;
    AppMethodBeat.o(128102);
  }

  private boolean checkSumConsistent(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    boolean bool = false;
    AppMethodBeat.i(128137);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0) || (paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "checkSumConsistent fail, invalid arguments");
      AppMethodBeat.o(128137);
    }
    while (true)
    {
      return bool;
      if (paramArrayOfByte1.length != paramArrayOfByte2.length)
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "checkSumConsistent fail, length is different");
        AppMethodBeat.o(128137);
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= paramArrayOfByte1.length)
            break label96;
          if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
          {
            AppMethodBeat.o(128137);
            break;
          }
        }
        label96: bool = true;
        AppMethodBeat.o(128137);
      }
    }
  }

  private boolean createChatroom(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128124);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_basereq_transaction", ""), paramBundle.getString("_wxapi_create_chatroom_group_id", ""), paramBundle.getString("_wxapi_create_chatroom_chatroom_name", ""), paramBundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), paramBundle.getString("_wxapi_create_chatroom_ext_msg", ""), paramBundle.getString("_wxapi_basereq_openid", "") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128124);
    return true;
  }

  private String getTokenFromWX(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(128112);
    Cursor localCursor = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"), null, null, new String[] { this.appId, "620954368" }, null);
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      paramContext = localCursor.getString(0);
      Log.i("MicroMsg.SDK.WXApiImplV10", "getTokenFromWX token is ".concat(String.valueOf(paramContext)));
      localCursor.close();
      AppMethodBeat.o(128112);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(128112);
      paramContext = localObject;
    }
  }

  private boolean handleWxInternalRespType(String paramString, IWXAPIEventHandler paramIWXAPIEventHandler)
  {
    boolean bool = false;
    AppMethodBeat.i(128107);
    Log.i("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType, extInfo = ".concat(String.valueOf(paramString)));
    try
    {
      paramString = Uri.parse(paramString);
      Object localObject = paramString.getQueryParameter("wx_internal_resptype");
      Log.i("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType, respType = ".concat(String.valueOf(localObject)));
      if (d.b((String)localObject))
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType fail, respType is null");
        AppMethodBeat.o(128107);
      }
      while (true)
      {
        return bool;
        String str;
        if (((String)localObject).equals("subscribemessage"))
        {
          localObject = new com/tencent/mm/opensdk/modelbiz/SubscribeMessage$Resp;
          ((SubscribeMessage.Resp)localObject).<init>();
          str = paramString.getQueryParameter("ret");
          if ((str != null) && (str.length() > 0))
            ((SubscribeMessage.Resp)localObject).errCode = d.c(str);
          ((SubscribeMessage.Resp)localObject).openId = paramString.getQueryParameter("openid");
          ((SubscribeMessage.Resp)localObject).templateID = paramString.getQueryParameter("template_id");
          ((SubscribeMessage.Resp)localObject).scene = d.c(paramString.getQueryParameter("scene"));
          ((SubscribeMessage.Resp)localObject).action = paramString.getQueryParameter("action");
          ((SubscribeMessage.Resp)localObject).reserved = paramString.getQueryParameter("reserved");
          paramIWXAPIEventHandler.onResp((BaseResp)localObject);
          AppMethodBeat.o(128107);
          bool = true;
        }
        else if (((String)localObject).contains("invoice_auth_insert"))
        {
          localObject = new com/tencent/mm/opensdk/modelbiz/WXInvoiceAuthInsert$Resp;
          ((WXInvoiceAuthInsert.Resp)localObject).<init>();
          str = paramString.getQueryParameter("ret");
          if ((str != null) && (str.length() > 0))
            ((WXInvoiceAuthInsert.Resp)localObject).errCode = d.c(str);
          ((WXInvoiceAuthInsert.Resp)localObject).wxOrderId = paramString.getQueryParameter("wx_order_id");
          paramIWXAPIEventHandler.onResp((BaseResp)localObject);
          AppMethodBeat.o(128107);
          bool = true;
        }
        else if (((String)localObject).contains("payinsurance"))
        {
          localObject = new com/tencent/mm/opensdk/modelbiz/WXPayInsurance$Resp;
          ((WXPayInsurance.Resp)localObject).<init>();
          str = paramString.getQueryParameter("ret");
          if ((str != null) && (str.length() > 0))
            ((WXPayInsurance.Resp)localObject).errCode = d.c(str);
          ((WXPayInsurance.Resp)localObject).wxOrderId = paramString.getQueryParameter("wx_order_id");
          paramIWXAPIEventHandler.onResp((BaseResp)localObject);
          AppMethodBeat.o(128107);
          bool = true;
        }
        else if (((String)localObject).contains("nontaxpay"))
        {
          localObject = new com/tencent/mm/opensdk/modelbiz/WXNontaxPay$Resp;
          ((WXNontaxPay.Resp)localObject).<init>();
          str = paramString.getQueryParameter("ret");
          if ((str != null) && (str.length() > 0))
            ((WXNontaxPay.Resp)localObject).errCode = d.c(str);
          ((WXNontaxPay.Resp)localObject).wxOrderId = paramString.getQueryParameter("wx_order_id");
          paramIWXAPIEventHandler.onResp((BaseResp)localObject);
          AppMethodBeat.o(128107);
          bool = true;
        }
        else if (("subscribeminiprogrammsg".equals(localObject)) || ("5".equals(localObject)))
        {
          localObject = new com/tencent/mm/opensdk/modelbiz/SubscribeMiniProgramMsg$Resp;
          ((SubscribeMiniProgramMsg.Resp)localObject).<init>();
          str = paramString.getQueryParameter("ret");
          if ((str != null) && (str.length() > 0))
            ((SubscribeMiniProgramMsg.Resp)localObject).errCode = d.c(str);
          ((SubscribeMiniProgramMsg.Resp)localObject).openId = paramString.getQueryParameter("openid");
          ((SubscribeMiniProgramMsg.Resp)localObject).unionId = paramString.getQueryParameter("unionid");
          ((SubscribeMiniProgramMsg.Resp)localObject).nickname = paramString.getQueryParameter("nickname");
          ((SubscribeMiniProgramMsg.Resp)localObject).errStr = paramString.getQueryParameter("errmsg");
          paramIWXAPIEventHandler.onResp((BaseResp)localObject);
          AppMethodBeat.o(128107);
          bool = true;
        }
        else
        {
          Log.e("MicroMsg.SDK.WXApiImplV10", "this open sdk version not support the request type");
          AppMethodBeat.o(128107);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
        Log.e("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType fail, ex = " + paramString.getMessage());
    }
  }

  private boolean joinChatroom(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128125);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_basereq_transaction", ""), paramBundle.getString("_wxapi_join_chatroom_group_id", ""), paramBundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), paramBundle.getString("_wxapi_join_chatroom_ext_msg", ""), paramBundle.getString("_wxapi_basereq_openid", "") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128125);
    return true;
  }

  private boolean sendAddCardToWX(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128117);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_add_card_to_wx_card_list"), paramBundle.getString("_wxapi_basereq_transaction") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128117);
    return true;
  }

  private boolean sendChooseCardFromWX(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128118);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, new String[] { paramBundle.getString("_wxapi_choose_card_from_wx_card_app_id"), paramBundle.getString("_wxapi_choose_card_from_wx_card_location_id"), paramBundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), paramBundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), paramBundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), paramBundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), paramBundle.getString("_wxapi_choose_card_from_wx_card_card_id"), paramBundle.getString("_wxapi_choose_card_from_wx_card_card_type"), paramBundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), paramBundle.getString("_wxapi_basereq_transaction") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128118);
    return true;
  }

  private boolean sendHandleScanResult(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128126);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_scan_qrcode_result") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128126);
    return true;
  }

  private boolean sendInvoiceAuthInsert(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128129);
    Object localObject = (WXInvoiceAuthInsert.Req)paramBaseReq;
    paramBaseReq = paramContext.getContentResolver();
    paramContext = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
    localObject = URLEncoder.encode(String.format("url=%s", new Object[] { URLEncoder.encode(((WXInvoiceAuthInsert.Req)localObject).url) }));
    paramContext = paramBaseReq.query(paramContext, null, null, new String[] { this.appId, "2", localObject }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128129);
    return true;
  }

  private boolean sendJumpToBizProfileReq(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128114);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name"), paramBundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg"), paramBundle.getInt("_wxapi_jump_to_biz_profile_req_scene"), paramBundle.getInt("_wxapi_jump_to_biz_profile_req_profile_type") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128114);
    return true;
  }

  private boolean sendJumpToBizTempSessionReq(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128116);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizTempSession"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), paramBundle.getString("_wxapi_jump_to_biz_webview_req_session_from"), paramBundle.getInt("_wxapi_jump_to_biz_webview_req_show_type") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128116);
    return true;
  }

  private boolean sendJumpToBizWebviewReq(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128115);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), paramBundle.getString("_wxapi_jump_to_biz_webview_req_ext_msg"), paramBundle.getInt("_wxapi_jump_to_biz_webview_req_scene") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128115);
    return true;
  }

  private boolean sendJumpToOfflinePayReq(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128122);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"), null, null, new String[] { this.appId }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128122);
    return true;
  }

  private boolean sendLaunchWXMiniprogram(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128132);
    paramBaseReq = (WXLaunchMiniProgram.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"), null, null, new String[] { this.appId, paramBaseReq.userName, paramBaseReq.path, paramBaseReq.miniprogramType, paramBaseReq.extData }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128132);
    return true;
  }

  private boolean sendNonTaxPay(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128130);
    paramBaseReq = (WXNontaxPay.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver();
    Uri localUri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
    paramBaseReq = URLEncoder.encode(String.format("url=%s", new Object[] { URLEncoder.encode(paramBaseReq.url) }));
    paramContext = paramContext.query(localUri, null, null, new String[] { this.appId, "3", paramBaseReq }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128130);
    return true;
  }

  private boolean sendOpenBusiLuckyMoney(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128123);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), paramBundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), paramBundle.getString("_wxapi_open_busi_lucky_money_signType"), paramBundle.getString("_wxapi_open_busi_lucky_money_signature"), paramBundle.getString("_wxapi_open_busi_lucky_money_package") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128123);
    return true;
  }

  private boolean sendOpenBusinessView(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128133);
    paramBaseReq = (WXOpenBusinessView.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessView"), null, null, new String[] { this.appId, paramBaseReq.businessType, paramBaseReq.query, paramBaseReq.extInfo }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128133);
    return true;
  }

  private boolean sendOpenBusinessWebview(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128121);
    WXOpenBusinessWebview.Req localReq = (WXOpenBusinessWebview.Req)paramBaseReq;
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Uri localUri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessWebview");
    paramBaseReq = "";
    paramContext = paramBaseReq;
    if (localReq.queryInfo != null)
    {
      paramContext = paramBaseReq;
      if (localReq.queryInfo.size() > 0)
        paramContext = new JSONObject(localReq.queryInfo).toString();
    }
    paramContext = localContentResolver.query(localUri, null, null, new String[] { this.appId, localReq.businessType, paramContext }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128121);
    return true;
  }

  private boolean sendOpenRankListReq(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128119);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new String[0], null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128119);
    return true;
  }

  private boolean sendOpenWebview(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128120);
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, new String[] { this.appId, paramBundle.getString("_wxapi_jump_to_webview_url"), paramBundle.getString("_wxapi_basereq_transaction") }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128120);
    return true;
  }

  private boolean sendPayInSurance(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128131);
    paramBaseReq = (WXPayInsurance.Req)paramBaseReq;
    ContentResolver localContentResolver = paramContext.getContentResolver();
    paramContext = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview");
    paramBaseReq = URLEncoder.encode(String.format("url=%s", new Object[] { URLEncoder.encode(paramBaseReq.url) }));
    paramContext = localContentResolver.query(paramContext, null, null, new String[] { this.appId, "4", paramBaseReq }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128131);
    return true;
  }

  private boolean sendPayReq(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(128113);
    if (wxappPayEntryClassname == null)
    {
      wxappPayEntryClassname = new MMSharedPreferences(paramContext).getString("_wxapp_pay_entry_classname_", null);
      Log.d("MicroMsg.SDK.WXApiImplV10", "pay, set wxappPayEntryClassname = " + wxappPayEntryClassname);
      if (wxappPayEntryClassname != null);
    }
    while (true)
    {
      try
      {
        wxappPayEntryClassname = paramContext.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
        if (wxappPayEntryClassname == null)
        {
          Log.e("MicroMsg.SDK.WXApiImplV10", "pay fail, wxappPayEntryClassname is null");
          bool = false;
          AppMethodBeat.o(128113);
          return bool;
        }
      }
      catch (Exception localException)
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + localException.getMessage());
        continue;
      }
      MMessageActV2.Args localArgs = new MMessageActV2.Args();
      localArgs.bundle = paramBundle;
      localArgs.targetPkgName = "com.tencent.mm";
      localArgs.targetClassName = wxappPayEntryClassname;
      boolean bool = MMessageActV2.send(paramContext, localArgs);
      AppMethodBeat.o(128113);
    }
  }

  private boolean sendSubscribeMessage(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128127);
    paramBaseReq = (SubscribeMessage.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[] { this.appId, "1", String.valueOf(paramBaseReq.scene), paramBaseReq.templateID, paramBaseReq.reserved }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128127);
    return true;
  }

  private boolean sendSubscribeMiniProgramMsg(Context paramContext, BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128128);
    paramBaseReq = (SubscribeMiniProgramMsg.Req)paramBaseReq;
    paramContext = paramContext.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[] { this.appId, "5", paramBaseReq.miniProgramAppId }, null);
    if (paramContext != null)
      paramContext.close();
    AppMethodBeat.o(128128);
    return true;
  }

  public void detach()
  {
    AppMethodBeat.i(128135);
    Log.d("MicroMsg.SDK.WXApiImplV10", "detach");
    this.detached = true;
    this.context = null;
    AppMethodBeat.o(128135);
  }

  public int getWXAppSupportAPI()
  {
    int i = 0;
    AppMethodBeat.i(128109);
    Object localObject;
    if (this.detached)
    {
      localObject = new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
      AppMethodBeat.o(128109);
      throw ((Throwable)localObject);
    }
    if (!isWXAppInstalled())
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
      AppMethodBeat.o(128109);
    }
    while (true)
    {
      return i;
      this.wxSdkVersion = 0;
      localObject = new CountDownLatch(1);
      new Thread(new BaseWXApiImplV10.1(this, (CountDownLatch)localObject)).run();
      try
      {
        ((CountDownLatch)localObject).await(1000L, TimeUnit.MILLISECONDS);
        Log.d("MicroMsg.SDK.WXApiImplV10", "_build_info_sdk_int_ = " + this.wxSdkVersion);
        if (this.wxSdkVersion != 0);
      }
      catch (InterruptedException localInterruptedException)
      {
        try
        {
          this.wxSdkVersion = this.context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("OPEN_SDK_VERSION = ");
          Log.d("MicroMsg.SDK.WXApiImplV10", this.wxSdkVersion);
          i = this.wxSdkVersion;
          AppMethodBeat.o(128109);
          continue;
          localInterruptedException = localInterruptedException;
          Log.w("MicroMsg.SDK.WXApiImplV10", localInterruptedException.getMessage());
        }
        catch (Exception localException)
        {
          while (true)
            Log.e("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + localException.getMessage());
        }
      }
    }
  }

  public boolean handleIntent(Intent paramIntent, IWXAPIEventHandler paramIWXAPIEventHandler)
  {
    boolean bool1 = false;
    AppMethodBeat.i(128106);
    try
    {
      if (!WXApiImplComm.isIntentFromWx(paramIntent, "com.tencent.mm.openapi.token"))
      {
        Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent fail, intent not from weixin msg");
        AppMethodBeat.o(128106);
        return bool1;
      }
      if (this.detached)
      {
        paramIntent = new java/lang/IllegalStateException;
        paramIntent.<init>("handleIntent fail, WXMsgImpl has been detached");
        AppMethodBeat.o(128106);
        throw paramIntent;
      }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "handleIntent fail, ex = " + paramIntent.getMessage());
        while (true)
        {
          AppMethodBeat.o(128106);
          break;
          localObject1 = paramIntent.getStringExtra("_mmessage_content");
          int i = paramIntent.getIntExtra("_mmessage_sdkVersion", 0);
          localObject2 = paramIntent.getStringExtra("_mmessage_appPackage");
          if ((localObject2 == null) || (((String)localObject2).length() == 0))
          {
            Log.e("MicroMsg.SDK.WXApiImplV10", "invalid argument");
            AppMethodBeat.o(128106);
            break;
          }
          if (!checkSumConsistent(paramIntent.getByteArrayExtra("_mmessage_checksum"), b.a((String)localObject1, i, (String)localObject2)))
          {
            Log.e("MicroMsg.SDK.WXApiImplV10", "checksum fail");
            AppMethodBeat.o(128106);
            break;
          }
          i = paramIntent.getIntExtra("_wxapi_command_type", 0);
          Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent, cmd = ".concat(String.valueOf(i)));
          switch (i)
          {
          case 7:
          case 8:
          case 10:
          case 11:
          case 13:
          case 18:
          case 20:
          case 21:
          case 22:
          case 23:
          default:
            Log.e("MicroMsg.SDK.WXApiImplV10", "unknown cmd = ".concat(String.valueOf(i)));
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 9:
          case 16:
          case 14:
          case 15:
          case 12:
          case 17:
          case 19:
          case 26:
          case 24:
          case 25:
          }
        }
        Object localObject2 = new com/tencent/mm/opensdk/modelmsg/SendAuth$Resp;
        ((SendAuth.Resp)localObject2).<init>(paramIntent.getExtras());
        paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
        AppMethodBeat.o(128106);
        bool1 = true;
        continue;
        localObject2 = new com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Resp;
        ((SendMessageToWX.Resp)localObject2).<init>(paramIntent.getExtras());
        paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
        AppMethodBeat.o(128106);
        bool1 = true;
        continue;
        localObject2 = new com/tencent/mm/opensdk/modelmsg/GetMessageFromWX$Req;
        ((GetMessageFromWX.Req)localObject2).<init>(paramIntent.getExtras());
        paramIWXAPIEventHandler.onReq((BaseReq)localObject2);
        AppMethodBeat.o(128106);
        bool1 = true;
        continue;
        localObject2 = new com/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;
        ((ShowMessageFromWX.Req)localObject2).<init>(paramIntent.getExtras());
        Object localObject1 = ((ShowMessageFromWX.Req)localObject2).message.messageExt;
        boolean bool2;
        if ((localObject1 != null) && (((String)localObject1).contains("wx_internal_resptype")))
        {
          bool2 = handleWxInternalRespType((String)localObject1, paramIWXAPIEventHandler);
          Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent, extInfo contains wx_internal_resptype, ret = ".concat(String.valueOf(bool2)));
          AppMethodBeat.o(128106);
          bool1 = bool2;
        }
        else
        {
          if (localObject1 != null)
          {
            bool2 = ((String)localObject1).contains("openbusinesswebview");
            if (!bool2);
          }
          try
          {
            paramIntent = Uri.parse((String)localObject1);
            if ((paramIntent != null) && ("openbusinesswebview".equals(paramIntent.getHost())))
            {
              localObject1 = new com/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;
              ((WXOpenBusinessWebview.Resp)localObject1).<init>();
              String str = paramIntent.getQueryParameter("ret");
              if ((str != null) && (str.length() > 0))
                ((WXOpenBusinessWebview.Resp)localObject1).errCode = d.c(str);
              ((WXOpenBusinessWebview.Resp)localObject1).resultInfo = paramIntent.getQueryParameter("resultInfo");
              ((WXOpenBusinessWebview.Resp)localObject1).errStr = paramIntent.getQueryParameter("errmsg");
              paramIntent = paramIntent.getQueryParameter("type");
              if ((paramIntent != null) && (paramIntent.length() > 0))
                ((WXOpenBusinessWebview.Resp)localObject1).businessType = d.c(paramIntent);
              paramIWXAPIEventHandler.onResp((BaseResp)localObject1);
              AppMethodBeat.o(128106);
              bool1 = true;
              continue;
            }
            Log.d("MicroMsg.SDK.WXApiImplV10", "not openbusinesswebview %".concat(String.valueOf(localObject1)));
            paramIWXAPIEventHandler.onReq((BaseReq)localObject2);
            AppMethodBeat.o(128106);
            bool1 = true;
          }
          catch (Exception paramIntent)
          {
            while (true)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("parse fail, ex = ");
              Log.e("MicroMsg.SDK.WXApiImplV10", paramIntent.getMessage());
            }
          }
          localObject2 = new com/tencent/mm/opensdk/modelpay/PayResp;
          ((PayResp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelmsg/LaunchFromWX$Req;
          ((LaunchFromWX.Req)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onReq((BaseReq)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;
          ((AddCardToWXCardPackage.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/ChooseCardFromWXCardPackage$Resp;
          ((ChooseCardFromWXCardPackage.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/CreateChatroom$Resp;
          ((CreateChatroom.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/JoinChatroom$Resp;
          ((JoinChatroom.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/OpenWebview$Resp;
          ((OpenWebview.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/HandleScanResult$Resp;
          ((HandleScanResult.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Resp;
          ((WXLaunchMiniProgram.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/WXOpenBusinessView$Resp;
          ((WXOpenBusinessView.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelpay/JumpToOfflinePay$Resp;
          ((JumpToOfflinePay.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
          continue;
          localObject2 = new com/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;
          ((WXOpenBusinessWebview.Resp)localObject2).<init>(paramIntent.getExtras());
          paramIWXAPIEventHandler.onResp((BaseResp)localObject2);
          AppMethodBeat.o(128106);
          bool1 = true;
        }
      }
    }
  }

  public boolean isWXAppInstalled()
  {
    boolean bool1 = false;
    AppMethodBeat.i(128108);
    Object localObject;
    if (this.detached)
    {
      localObject = new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
      AppMethodBeat.o(128108);
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
      if (localObject == null)
      {
        AppMethodBeat.o(128108);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        bool2 = WXApiImplComm.validateAppSignature(this.context, ((PackageInfo)localObject).signatures, this.checkSignature);
        AppMethodBeat.o(128108);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        AppMethodBeat.o(128108);
        boolean bool2 = bool1;
      }
    }
  }

  public boolean openWXApp()
  {
    boolean bool = false;
    AppMethodBeat.i(128110);
    if (this.detached)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
      AppMethodBeat.o(128110);
      throw localIllegalStateException;
    }
    if (!isWXAppInstalled())
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
      AppMethodBeat.o(128110);
    }
    while (true)
    {
      return bool;
      try
      {
        this.context.startActivity(this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
        bool = true;
        AppMethodBeat.o(128110);
      }
      catch (Exception localException)
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "startActivity fail, exception = " + localException.getMessage());
        AppMethodBeat.o(128110);
      }
    }
  }

  public boolean registerApp(String paramString)
  {
    AppMethodBeat.i(128103);
    boolean bool = registerApp(paramString, 0L);
    AppMethodBeat.o(128103);
    return bool;
  }

  public boolean registerApp(String paramString, long paramLong)
  {
    AppMethodBeat.i(128104);
    if (this.detached)
    {
      paramString = new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
      AppMethodBeat.o(128104);
      throw paramString;
    }
    boolean bool;
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "register app failed for wechat app signature check failed");
      bool = false;
      AppMethodBeat.o(128104);
    }
    while (true)
    {
      return bool;
      Log.d("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = ".concat(String.valueOf(paramString)));
      if (paramString != null)
        this.appId = paramString;
      Log.d("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = ".concat(String.valueOf(paramString)));
      if (paramString != null)
        this.appId = paramString;
      Log.d("MicroMsg.SDK.WXApiImplV10", "register app " + this.context.getPackageName());
      paramString = new a.a();
      paramString.a = "com.tencent.mm";
      paramString.action = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER";
      paramString.content = ("weixin://registerapp?appid=" + this.appId);
      paramString.b = paramLong;
      bool = a.a(this.context, paramString);
      AppMethodBeat.o(128104);
    }
  }

  public boolean sendReq(BaseReq paramBaseReq)
  {
    AppMethodBeat.i(128111);
    if (this.detached)
    {
      paramBaseReq = new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
      AppMethodBeat.o(128111);
      throw paramBaseReq;
    }
    boolean bool;
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "sendReq failed for wechat app signature check failed");
      AppMethodBeat.o(128111);
      bool = false;
    }
    Bundle localBundle;
    while (true)
    {
      return bool;
      if (!paramBaseReq.checkArgs())
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "sendReq checkArgs fail");
        AppMethodBeat.o(128111);
        bool = false;
      }
      else
      {
        Log.i("MicroMsg.SDK.WXApiImplV10", "sendReq, req type = " + paramBaseReq.getType());
        localBundle = new Bundle();
        paramBaseReq.toBundle(localBundle);
        if (paramBaseReq.getType() == 5)
        {
          bool = sendPayReq(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 7)
        {
          bool = sendJumpToBizProfileReq(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 8)
        {
          bool = sendJumpToBizWebviewReq(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 10)
        {
          bool = sendJumpToBizTempSessionReq(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 9)
        {
          bool = sendAddCardToWX(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 16)
        {
          bool = sendChooseCardFromWX(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 11)
        {
          bool = sendOpenRankListReq(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 12)
        {
          bool = sendOpenWebview(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 25)
        {
          bool = sendOpenBusinessWebview(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 13)
        {
          bool = sendOpenBusiLuckyMoney(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 14)
        {
          bool = createChatroom(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 15)
        {
          bool = joinChatroom(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 17)
        {
          bool = sendHandleScanResult(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 18)
        {
          bool = sendSubscribeMessage(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 23)
        {
          bool = sendSubscribeMiniProgramMsg(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 19)
        {
          bool = sendLaunchWXMiniprogram(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 26)
        {
          bool = sendOpenBusinessView(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 20)
        {
          bool = sendInvoiceAuthInsert(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 21)
        {
          bool = sendNonTaxPay(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else if (paramBaseReq.getType() == 22)
        {
          bool = sendPayInSurance(this.context, paramBaseReq);
          AppMethodBeat.o(128111);
        }
        else
        {
          if (paramBaseReq.getType() != 24)
            break;
          bool = sendJumpToOfflinePayReq(this.context, localBundle);
          AppMethodBeat.o(128111);
        }
      }
    }
    int i;
    SendMessageToWX.Req localReq;
    if (paramBaseReq.getType() == 2)
    {
      i = localBundle.getInt("_wxapi_sendmessagetowx_req_media_type");
      if (d.a(i))
      {
        localReq = (SendMessageToWX.Req)paramBaseReq;
        if (getWXAppSupportAPI() >= 620756993)
          break label895;
        localObject = new WXWebpageObject();
        ((WXWebpageObject)localObject).webpageUrl = localBundle.getString("_wxminiprogram_webpageurl");
        localReq.message.mediaObject = ((WXMediaMessage.IMediaObject)localObject);
      }
    }
    label895: WXMiniProgramObject localWXMiniProgramObject;
    label946: 
    do
    {
      while (true)
      {
        if (localReq.scene != 3)
          localReq.scene = 0;
        paramBaseReq.toBundle(localBundle);
        localObject = getTokenFromWX(this.context);
        paramBaseReq = new MMessageActV2.Args();
        paramBaseReq.bundle = localBundle;
        paramBaseReq.content = ("weixin://sendreq?appid=" + this.appId);
        paramBaseReq.targetPkgName = "com.tencent.mm";
        paramBaseReq.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
        paramBaseReq.token = ((String)localObject);
        bool = MMessageActV2.send(this.context, paramBaseReq);
        AppMethodBeat.o(128111);
        break;
        if ((i != 46) || (getWXAppSupportAPI() >= 620953856))
          break label946;
        localObject = new WXWebpageObject();
        ((WXWebpageObject)localObject).webpageUrl = localBundle.getString("_wxminiprogram_webpageurl");
        localReq.message.mediaObject = ((WXMediaMessage.IMediaObject)localObject);
      }
      localWXMiniProgramObject = (WXMiniProgramObject)localReq.message.mediaObject;
      localWXMiniProgramObject.userName += "@app";
      localObject = localWXMiniProgramObject.path;
    }
    while (d.b((String)localObject));
    Object localObject = ((String)localObject).split("\\?");
    if (localObject.length > 1);
    for (localObject = localObject[0] + ".html?" + localObject[1]; ; localObject = localObject[0] + ".html")
    {
      localWXMiniProgramObject.path = ((String)localObject);
      break;
    }
  }

  public boolean sendResp(BaseResp paramBaseResp)
  {
    boolean bool = false;
    AppMethodBeat.i(128134);
    if (this.detached)
    {
      paramBaseResp = new IllegalStateException("sendResp fail, WXMsgImpl has been detached");
      AppMethodBeat.o(128134);
      throw paramBaseResp;
    }
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "sendResp failed for wechat app signature check failed");
      AppMethodBeat.o(128134);
    }
    while (true)
    {
      return bool;
      if (!paramBaseResp.checkArgs())
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "sendResp checkArgs fail");
        AppMethodBeat.o(128134);
      }
      else
      {
        Bundle localBundle = new Bundle();
        paramBaseResp.toBundle(localBundle);
        paramBaseResp = new MMessageActV2.Args();
        paramBaseResp.bundle = localBundle;
        paramBaseResp.content = ("weixin://sendresp?appid=" + this.appId);
        paramBaseResp.targetPkgName = "com.tencent.mm";
        paramBaseResp.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
        bool = MMessageActV2.send(this.context, paramBaseResp);
        AppMethodBeat.o(128134);
      }
    }
  }

  public void setLogImpl(ILog paramILog)
  {
    AppMethodBeat.i(128136);
    Log.setLogImpl(paramILog);
    AppMethodBeat.o(128136);
  }

  public void unregisterApp()
  {
    AppMethodBeat.i(128105);
    Object localObject;
    if (this.detached)
    {
      localObject = new IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
      AppMethodBeat.o(128105);
      throw ((Throwable)localObject);
    }
    if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature))
    {
      Log.e("MicroMsg.SDK.WXApiImplV10", "unregister app failed for wechat app signature check failed");
      AppMethodBeat.o(128105);
    }
    while (true)
    {
      return;
      Log.d("MicroMsg.SDK.WXApiImplV10", "unregisterApp, appId = " + this.appId);
      if ((this.appId == null) || (this.appId.length() == 0))
      {
        Log.e("MicroMsg.SDK.WXApiImplV10", "unregisterApp fail, appId is empty");
        AppMethodBeat.o(128105);
      }
      else
      {
        Log.d("MicroMsg.SDK.WXApiImplV10", "unregister app " + this.context.getPackageName());
        localObject = new a.a();
        ((a.a)localObject).a = "com.tencent.mm";
        ((a.a)localObject).action = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_UNREGISTER";
        ((a.a)localObject).content = ("weixin://unregisterapp?appid=" + this.appId);
        a.a(this.context, (a.a)localObject);
        AppMethodBeat.o(128105);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.openapi.BaseWXApiImplV10
 * JD-Core Version:    0.6.2
 */