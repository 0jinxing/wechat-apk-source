package com.tencent.mm.plugin.appbrand.appcache.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.t.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.WeAppSyncVersionSetting;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.protocal.protobuf.cga;
import com.tencent.mm.protocal.protobuf.it;
import com.tencent.mm.protocal.protobuf.iu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class a extends com.tencent.mm.ai.a<iu>
{
  private final b ehh;

  private a(List<cga> paramList)
  {
    AppMethodBeat.i(129443);
    b.a locala = new b.a();
    it localit = new it();
    localit.vKs.addAll(paramList);
    locala.fsJ = localit;
    locala.fsK = new iu();
    locala.fsI = 2763;
    locala.uri = "/cgi-bin/mmbiz-bin/wxasync/wxabatchsyncversion";
    paramList = locala.acD();
    this.ehh = paramList;
    this.ehh = paramList;
    AppMethodBeat.o(129443);
  }

  static List<cga> awt()
  {
    AppMethodBeat.i(129444);
    long l1;
    Object localObject2;
    if (!((Boolean)g.RP().Ry().get(ac.a.xOy, Boolean.TRUE)).booleanValue())
    {
      i = 1;
      if (i != 0)
      {
        localObject1 = (k)f.E(k.class);
        l1 = bo.anT();
        long l2 = AppBrandGlobalSystemConfig.ayC().hge.hgz;
        i = AppBrandGlobalSystemConfig.ayC().hge.hgA;
        localObject2 = "select distinct username,updateTime from AppBrandLocalUsageRecord where updateTime >= " + (l1 - l2) + " order by updateTime desc limit " + i + " offset 0 ";
        localObject2 = ((k)localObject1).gTC.rawQuery((String)localObject2, null);
        if ((localObject2 != null) && (!((Cursor)localObject2).isClosed()))
          break label265;
      }
    }
    t.a locala;
    Cursor localCursor;
    while (true)
    {
      g.RP().Ry().set(ac.a.xOy, Boolean.TRUE);
      locala = f.auK();
      i = AppBrandGlobalSystemConfig.ayC().hge.hgA;
      l1 = bo.anT() - AppBrandGlobalSystemConfig.ayC().hge.hgz;
      ab.i("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "collectReqInfoList with minUpdateTime( %s )", new Object[] { bo.mx(l1) });
      localCursor = locala.a("select distinct WxaAttributesTable.username,WxaAttributesTable.appId,WxaAttributesTable.versionInfo from AppBrandAppLaunchUsernameDuplicateRecord left outer join WxaAttributesTable on AppBrandAppLaunchUsernameDuplicateRecord.username=WxaAttributesTable.username where AppBrandAppLaunchUsernameDuplicateRecord.updateTime >= " + l1 + " order by AppBrandAppLaunchUsernameDuplicateRecord.updateTime desc limit " + i + " offset 0", null, 2);
      if ((localCursor != null) && (!localCursor.isClosed()))
        break label316;
      localObject1 = Collections.emptyList();
      AppMethodBeat.o(129444);
      return localObject1;
      i = 0;
      break;
      label265: if (((Cursor)localObject2).moveToLast())
        do
          ((k)localObject1).x(((Cursor)localObject2).getString(0), ((Cursor)localObject2).getLong(1));
        while (((Cursor)localObject2).moveToPrevious());
      ((Cursor)localObject2).close();
    }
    label316: Object localObject1 = new LinkedList();
    label343: Object localObject3;
    cga localcga;
    if (localCursor.moveToFirst())
    {
      localObject2 = new WxaAttributes();
      localObject3 = localCursor.getString(0);
      if (!bo.isNullOrNil((String)localObject3))
      {
        ((WxaAttributes)localObject2).d(localCursor);
        localcga = new cga();
        localcga.xfb = ((String)localObject3);
        if (((WxaAttributes)localObject2).ayL() != null)
          localcga.xfc = ((WxaAttributes)localObject2).ayL().axy;
        if (!bo.isNullOrNil(((WxaAttributes)localObject2).field_appId))
        {
          localObject3 = com.tencent.mm.plugin.appbrand.launching.h.bm(((WxaAttributes)localObject2).field_appId, 0);
          if (localObject3 == null)
            break label527;
        }
      }
    }
    label527: for (int i = ((WxaPkgWrappingInfo)localObject3).gVu; ; i = 0)
    {
      localcga.xfd = i;
      ((List)localObject1).add(localcga);
      if (localCursor.moveToNext())
        break label343;
      localCursor.close();
      i = locala.delete("AppBrandAppLaunchUsernameDuplicateRecord", "updateTime < ?", new String[] { String.valueOf(l1) });
      ab.i("MicroMsg.AppBrand.CgiBatchSyncPkgVersion", "collectReqInfoList, delete records updateTime < %s, count %d", new Object[] { bo.mx(l1), Integer.valueOf(i) });
      AppMethodBeat.o(129444);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.a
 * JD-Core Version:    0.6.2
 */