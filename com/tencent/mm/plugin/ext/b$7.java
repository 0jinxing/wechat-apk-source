package com.tencent.mm.plugin.ext;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Looper;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.a.a;
import com.tencent.mm.compatible.a.a.a;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.x;
import com.tencent.mm.pluginsdk.model.i;
import com.tencent.mm.pluginsdk.model.i.a;
import com.tencent.mm.pluginsdk.model.l;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bz;
import com.tencent.mm.storage.ca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

final class b$7 extends ak
{
  b$7(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140514", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public final void handleMessage(Message arg1)
  {
    AppMethodBeat.i(20266);
    if ((ah.getContext() == null) || (!aw.RK()))
    {
      ab.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong status");
      AppMethodBeat.o(20266);
    }
    Cursor localCursor;
    while (true)
    {
      return;
      localCursor = b.brA().dui();
      if (localCursor == null)
      {
        ab.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler getValidOpenMsgListener cu == null");
        AppMethodBeat.o(20266);
      }
      else
      {
        ab.d("MicroMsg.SubCoreExt", "notifyMsgChangeHandler listener count = %s", new Object[] { Integer.valueOf(localCursor.getCount()) });
        if (localCursor.getCount() > 0)
          break;
        localCursor.close();
        ab.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler cu.getCount() <= 0");
        AppMethodBeat.o(20266);
      }
    }
    label1025: label1166: 
    while (true)
    {
      Object localObject2;
      ArrayList localArrayList;
      try
      {
        while (true)
        {
          if (!localCursor.moveToFirst())
            break label326;
          HashMap localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          synchronized (this.lPx)
          {
            localHashMap.putAll(b.a(this.lPx));
            b.a(this.lPx).clear();
            localObject2 = new java/util/LinkedList;
            ((LinkedList)localObject2).<init>();
            localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
            if (localHashMap.entrySet() != null)
              break;
            ab.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler waitForNotify.entrySet() == null");
            AppMethodBeat.o(20266);
          }
        }
      }
      catch (Exception )
      {
        ab.e("MicroMsg.SubCoreExt", "Exception in handleMessage, %s", new Object[] { ???.getMessage() });
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(20266);
      }
      break;
      Object localObject3 = new com/tencent/mm/storage/bo;
      ((com.tencent.mm.storage.bo)localObject3).<init>();
      ((com.tencent.mm.storage.bo)localObject3).d(localCursor);
      if ((com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((com.tencent.mm.storage.bo)localObject3).field_appId)) || (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((com.tencent.mm.storage.bo)localObject3).field_packageName)))
        ab.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong msgListener, appid = %s, package = %s", new Object[] { ((com.tencent.mm.storage.bo)localObject3).field_appId, ((com.tencent.mm.storage.bo)localObject3).field_packageName });
      while (true)
      {
        if (localCursor.moveToNext())
          break label1166;
        label326: localCursor.close();
        AppMethodBeat.o(20266);
        break;
        Object localObject4 = localObject1.entrySet().iterator();
        Object localObject5;
        Object localObject6;
        while (((Iterator)localObject4).hasNext())
        {
          ??? = (Map.Entry)((Iterator)localObject4).next();
          localObject5 = com.tencent.mm.sdk.platformtools.bo.nullAsNil((String)???.getKey());
          localObject6 = (Integer)???.getValue();
          aw.ZK();
          ??? = c.XR().aoZ((String)localObject5);
          if ((??? != null) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(???.field_username)) && (???.field_unReadCount <= 0))
          {
            ab.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler no unread in conversation");
          }
          else if ((!t.nJ((String)localObject5)) && (!t.kH((String)localObject5)) && (!t.mZ((String)localObject5)))
          {
            Object localObject7 = b.brB();
            ??? = ((com.tencent.mm.storage.bo)localObject3).field_appId;
            if ((??? == null) || (???.length() <= 0) || (localObject5 == null) || (((String)localObject5).length() <= 0))
            {
              ??? = null;
              label505: if ((??? != null) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(???.field_openId)) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(???.field_username)))
                break label721;
              ab.d("MicroMsg.SubCoreExt", "notifyMsgChangeHandler openId is null, go get it.");
              ??? = (Integer)b.a(this.lPx).get(localObject5);
              if (??? != null)
                break label692;
              b.a(this.lPx).put(localObject5, localObject6);
            }
            while (true)
            {
              ((LinkedList)localObject2).add(localObject5);
              break;
              localObject7 = ((ca)localObject7).bSd.a("UserOpenIdInApp", null, "appId=? and username=? ", new String[] { com.tencent.mm.sdk.platformtools.bo.vA(???), com.tencent.mm.sdk.platformtools.bo.vA((String)localObject5) }, null, null, null, 2);
              if (!((Cursor)localObject7).moveToFirst())
              {
                ab.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with appId-%s, username-%s:", new Object[] { ???, localObject5 });
                ((Cursor)localObject7).close();
                ??? = null;
                break label505;
              }
              ??? = new com/tencent/mm/storage/bz;
              ???.<init>();
              ???.d((Cursor)localObject7);
              ((Cursor)localObject7).close();
              break label505;
              label692: b.a(this.lPx).put(localObject5, Integer.valueOf(???.intValue() + ((Integer)localObject6).intValue()));
            }
            label721: ab.v("MicroMsg.SubCoreExt", "username[%s], appId[%s], openId[%s]", new Object[] { ???.field_username, ???.field_appId, ???.field_openId });
            localArrayList.add(String.format("%s,%s,%s", new Object[] { ???.field_openId, localObject6, Long.valueOf(System.currentTimeMillis() - 1600L) }));
          }
        }
        if (((LinkedList)localObject2).size() > 0)
        {
          ab.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler doGetGetUserInfoInApp");
          localObject6 = this.lPx;
          ??? = ((com.tencent.mm.storage.bo)localObject3).field_appId;
          if ((!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(???)) && (((LinkedList)localObject2).size() > 0))
          {
            localObject4 = i.dgZ();
            localObject5 = ah.getContext();
            localObject6 = ((b)localObject6).lPo;
            ab.d("MicroMsg.GetUserInfoInAppLogic", "getGetUserInfoInApp");
            if (!i.vbc)
              ((i)localObject4).dha();
            if ((aw.RK()) && (localObject5 != null))
            {
              if (((LinkedList)localObject2).size() != 0)
                break label937;
              ab.d("MicroMsg.GetUserInfoInAppLogic", "userNameList empty");
            }
          }
        }
        while (true)
        {
          if (localArrayList.size() > 0)
            break label971;
          localCursor.close();
          ab.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler userDataList.size() <= 0");
          AppMethodBeat.o(20266);
          break;
          label937: ((i)localObject4).vbe = ((i.a)localObject6);
          localObject5 = new com/tencent/mm/pluginsdk/model/l;
          ((l)localObject5).<init>(???, (LinkedList)localObject2);
          am.bYM();
          d.a(14, (x)localObject5);
        }
        label971: if (((com.tencent.mm.storage.bo)localObject3).field_status == 1);
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label1025;
          ab.w("MicroMsg.SubCoreExt", "invalid msgListener, appid = %s, package = %s", new Object[] { ((com.tencent.mm.storage.bo)localObject3).field_appId, ((com.tencent.mm.storage.bo)localObject3).field_packageName });
          break;
        }
        if ((!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((com.tencent.mm.storage.bo)localObject3).field_appId)) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((com.tencent.mm.storage.bo)localObject3).field_packageName)))
        {
          ab.i("MicroMsg.SubCoreExt", "notify app, appId = %s, package = %s", new Object[] { ((com.tencent.mm.storage.bo)localObject3).field_appId, ((com.tencent.mm.storage.bo)localObject3).field_packageName });
          ??? = new android/content/Intent;
          ???.<init>("com.tencent.mm.plugin.openapi.Intent.ACTION_NOTIFY_MSG");
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("com.tencent.mm.category.");
          ???.addCategory(((com.tencent.mm.storage.bo)localObject3).field_packageName);
          localObject3 = new com/tencent/mm/plugin/ext/b$7$1;
          ((b.7.1)localObject3).<init>(this, ???);
          a.a(12, (a.a)localObject3);
          ???.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "NEW_MESSAGE");
          ???.putStringArrayListExtra("EXTRA_EXT_OPEN_USER_DATA", localArrayList);
          ah.getContext().sendBroadcast(???);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.7
 * JD-Core Version:    0.6.2
 */