package com.tencent.liteav;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.datareport.a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class d
{
  private static String a;
  private static HashMap<String, d.a> w;
  private HashMap b;
  private String c;
  private int d;
  private int e;
  private int f;
  private int g;
  private Context h;
  private String i;
  private long j;
  private int k;
  private long l;
  private boolean m;
  private long n;
  private int o;
  private boolean p;
  private long q;
  private long r;
  private long s;
  private long t;
  private long u;
  private String v;
  private String x;

  static
  {
    AppMethodBeat.i(67704);
    a = "TXCDataReport";
    w = new HashMap();
    AppMethodBeat.o(67704);
  }

  public d(Context paramContext)
  {
    AppMethodBeat.i(67681);
    this.p = false;
    this.q = 0L;
    this.r = 0L;
    this.s = 0L;
    this.t = 0L;
    this.u = 0L;
    this.x = "";
    this.b = new HashMap(100);
    this.h = paramContext.getApplicationContext();
    this.i = TXCCommonUtil.getAppVersion();
    this.o = 5000;
    this.u = 0L;
    AppMethodBeat.o(67681);
  }

  private void b(boolean paramBoolean)
  {
    AppMethodBeat.i(67701);
    Object localObject = new TXCDRExtInfo();
    ((TXCDRExtInfo)localObject).url = this.c;
    ((TXCDRExtInfo)localObject).report_common = false;
    ((TXCDRExtInfo)localObject).report_status = false;
    String str1 = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str1, a.ac, a.ar, (TXCDRExtInfo)localObject);
    this.u = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventValue(str1, a.ac, "u64_timestamp", String.valueOf(this.u));
    TXCDRApi.txSetEventValue(str1, a.ac, "str_device_type", (String)this.b.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str1, a.ac, "u32_network_type", e("u32_network_type"));
    long l1 = TXCStatus.b(this.x, 7107);
    long l2 = TXCStatus.b(this.x, 7108);
    long l3 = l2;
    if (l2 != -1L)
      l3 = l2 - l1;
    int i1 = a.ac;
    String str2;
    if (paramBoolean)
    {
      l2 = l3;
      TXCDRApi.txSetEventIntValue(str1, i1, "u32_dns_time", l2);
      str2 = TXCStatus.c(this.x, 7110);
      i1 = a.ac;
      if (!paramBoolean)
        break label850;
      localObject = str2;
      label210: TXCDRApi.txSetEventValue(str1, i1, "u32_server_ip", (String)localObject);
      l4 = TXCStatus.b(this.x, 7109);
      l2 = l4;
      if (l4 != -1L)
        l2 = l4 - l1;
      i1 = a.ac;
      if (!paramBoolean)
        break label856;
    }
    label850: label856: for (long l4 = l2; ; l4 = -1L)
    {
      TXCDRApi.txSetEventIntValue(str1, i1, "u32_connect_server_time", l4);
      TXCDRApi.txSetEventIntValue(str1, a.ac, "u32_stream_begin", -1L);
      this.j = (TXCStatus.b(this.x, 6001) - l1);
      TXCDRApi.txSetEventIntValue(str1, a.ac, "u32_first_i_frame", this.j);
      l4 = TXCStatus.b(this.x, 7103) - l1;
      TXCDRApi.txSetEventIntValue(str1, a.ac, "u32_first_frame_down", l4);
      TXCDRApi.txSetEventValue(str1, a.ac, "str_user_id", (String)this.b.get("str_user_id"));
      TXCDRApi.txSetEventValue(str1, a.ac, "str_package_name", (String)this.b.get("str_package_name"));
      TXCDRApi.txSetEventValue(str1, a.ac, "str_app_version", this.i);
      TXCDRApi.txSetEventValue(str1, a.ac, "dev_uuid", (String)this.b.get("dev_uuid"));
      i1 = TXCStatus.d(this.x, 2013);
      TXCDRApi.txSetEventValue(str1, a.ac, "u32_max_cache_time", String.valueOf(i1));
      int i2 = TXCStatus.d(this.x, 2012);
      TXCDRApi.txSetEventValue(str1, a.ac, "u32_min_cache_time", String.valueOf(i2));
      int i3 = TXCStatus.d(this.x, 7105);
      TXCDRApi.txSetEventValue(str1, a.ac, "u64_err_code", String.valueOf(i3));
      localObject = TXCStatus.c(this.x, 7106);
      TXCDRApi.txSetEventValue(str1, a.ac, "str_err_info", (String)localObject);
      int i4 = TXCStatus.d(this.x, 7112);
      TXCDRApi.txSetEventValue(str1, a.ac, "u32_link_type", String.valueOf(i4));
      int i5 = TXCStatus.d(this.x, 7111);
      TXCDRApi.txSetEventValue(str1, a.ac, "u32_channel_type", String.valueOf(i5));
      TXCDRApi.nativeReportEvent(str1, a.ac);
      TXCLog.d(a, "report evt 40501: token=" + str1 + " u64_timestamp=" + this.u + " str_device_type=" + (String)this.b.get("str_device_type") + " u32_network_type=" + e("u32_network_type") + " u32_dns_time=" + l3 + " u32_server_ip=" + str2 + " u32_connect_server_time=" + l2 + " u32_stream_begin=-1 u32_first_i_frame=" + this.j + " u32_first_frame_down=" + l4 + " str_user_id=" + (String)this.b.get("str_user_id") + " str_package_name=" + (String)this.b.get("str_package_name") + " str_app_version=" + this.i + " dev_uuid=" + (String)this.b.get("dev_uuid") + " u32_max_cache_time=" + i1 + " u32_min_cache_time=" + i2 + " u64_err_code=" + i3 + " str_err_info=" + (String)localObject + " u32_link_type=" + i4 + " u32_channel_type=" + i5);
      AppMethodBeat.o(67701);
      return;
      l2 = -1L;
      break;
      localObject = "";
      break label210;
    }
  }

  protected static boolean c(String paramString)
  {
    AppMethodBeat.i(67687);
    boolean bool;
    if ((paramString != null) && (paramString.contains("myqcloud")))
    {
      bool = true;
      AppMethodBeat.o(67687);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.liteav.basic.f.b.a().a(paramString);
      AppMethodBeat.o(67687);
    }
  }

  private int e(String paramString)
  {
    AppMethodBeat.i(67699);
    paramString = (Number)this.b.get(paramString);
    int i1;
    if (paramString != null)
    {
      i1 = paramString.intValue();
      AppMethodBeat.o(67699);
    }
    while (true)
    {
      return i1;
      i1 = 0;
      AppMethodBeat.o(67699);
    }
  }

  private void i()
  {
    AppMethodBeat.i(67690);
    Object localObject = new TXCDRExtInfo();
    ((TXCDRExtInfo)localObject).url = this.c;
    ((TXCDRExtInfo)localObject).report_common = false;
    ((TXCDRExtInfo)localObject).report_status = false;
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.Z, a.ar, (TXCDRExtInfo)localObject);
    long l1 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, a.Z, "u64_timestamp", l1);
    TXCDRApi.txSetEventValue(str, a.Z, "str_device_type", (String)this.b.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_network_type", e("u32_network_type"));
    long l2 = TXCStatus.b(this.x, 7107);
    long l3 = TXCStatus.b(this.x, 7108);
    long l4 = l3;
    if (l3 != -1L)
      l4 = l3 - l2;
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_dns_time", l4);
    localObject = TXCStatus.c(this.x, 7110);
    TXCDRApi.txSetEventValue(str, a.Z, "u32_server_ip", (String)localObject);
    long l5 = TXCStatus.b(this.x, 7109);
    l3 = l5;
    if (l5 != -1L)
      l3 = l5 - l2;
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_connect_server_time", l3);
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_stream_begin", -1L);
    this.j = (TXCStatus.b(this.x, 6001) - l2);
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_first_i_frame", this.j);
    l5 = TXCStatus.b(this.x, 7103) - l2;
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_first_frame_down", l5);
    TXCDRApi.txSetEventValue(str, a.Z, "str_user_id", (String)this.b.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, a.Z, "str_package_name", (String)this.b.get("str_package_name"));
    TXCDRApi.txSetEventValue(str, a.Z, "str_app_version", this.i);
    TXCDRApi.txSetEventValue(str, a.Z, "dev_uuid", (String)this.b.get("dev_uuid"));
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_isp2p", this.k);
    TXCDRApi.nativeReportEvent(str, a.Z);
    TXCLog.d(a, "report evt 40101: token=" + str + " u64_timestamp=" + l1 + " str_device_type=" + (String)this.b.get("str_device_type") + " u32_network_type=" + e("u32_network_type") + " u32_dns_time=" + l4 + " u32_server_ip=" + (String)localObject + " u32_connect_server_time=" + l3 + " u32_stream_begin=-1 u32_first_i_frame=" + this.j + " u32_first_frame_down=" + l5 + " str_user_id=" + (String)this.b.get("str_user_id") + " str_package_name=" + (String)this.b.get("str_package_name") + " str_app_version=" + this.i + " dev_uuid=" + (String)this.b.get("dev_uuid") + " u32_isp2p=" + this.k);
    AppMethodBeat.o(67690);
  }

  private void j()
  {
    AppMethodBeat.i(67691);
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.url = this.c;
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.Z, a.ar, localTXCDRExtInfo);
    long l1 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, a.Z, "u64_timestamp", l1);
    TXCDRApi.txSetEventValue(str, a.Z, "str_device_type", (String)this.b.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_network_type", e("u32_network_type"));
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_dns_time", -1L);
    TXCDRApi.txSetEventValue(str, a.Z, "u32_server_ip", "");
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_connect_server_time", -1L);
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_stream_begin", -1L);
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_first_i_frame", -1L);
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_first_frame_down", -1L);
    TXCDRApi.txSetEventValue(str, a.Z, "str_user_id", (String)this.b.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, a.Z, "str_package_name", (String)this.b.get("str_package_name"));
    TXCDRApi.txSetEventValue(str, a.Z, "str_app_version", this.i);
    TXCDRApi.txSetEventValue(str, a.Z, "dev_uuid", (String)this.b.get("dev_uuid"));
    TXCDRApi.txSetEventIntValue(str, a.Z, "u32_isp2p", this.k);
    TXCDRApi.nativeReportEvent(str, a.Z);
    TXCLog.d(a, "report evt 40101: token=" + str + " u64_timestamp=" + l1 + " str_device_type=" + (String)this.b.get("str_device_type") + " u32_network_type=" + e("u32_network_type") + " u32_dns_time=-1 u32_server_ip= u32_connect_server_time=-1 u32_stream_begin=-1 u32_first_i_frame=-1 u32_first_frame_down=-1 str_user_id=" + (String)this.b.get("str_user_id") + " str_package_name=" + (String)this.b.get("str_package_name") + " str_app_version=" + this.i + " dev_uuid=" + (String)this.b.get("dev_uuid") + " u32_isp2p=" + this.k);
    AppMethodBeat.o(67691);
  }

  private void k()
  {
    AppMethodBeat.i(67692);
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.url = this.c;
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.ab, a.ar, localTXCDRExtInfo);
    long l1 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, a.ab, "u64_timestamp", l1);
    long l2 = TXCStatus.b(this.x, 7107);
    l2 = (TXCTimeUtil.getTimeTick() - l2) / 1000L;
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_result", l2);
    long l3 = TXCStatus.b(this.x, 6003);
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_avg_block_time", l3);
    TXCDRApi.txSetEventValue(str, a.ab, "str_app_version", this.i);
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_isp2p", this.k);
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_avg_load", TXCStatus.b(this.x, 2001));
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_load_cnt", TXCStatus.b(this.x, 2002));
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_max_load", TXCStatus.b(this.x, 2003));
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_first_i_frame", this.j);
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_speed_cnt", TXCStatus.b(this.x, 2004));
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_nodata_cnt", TXCStatus.b(this.x, 2005));
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_avg_cache_time", TXCStatus.b(this.x, 2007));
    TXCDRApi.txSetEventIntValue(str, a.ab, "u32_is_real_time", TXCStatus.b(this.x, 2008));
    TXCDRApi.nativeReportEvent(str, a.ab);
    TXCLog.d(a, "report evt 40102: token=" + str + " str_stream_url=" + this.c + " u64_timestamp=" + l1 + " u32_result=" + l2 + " u32_avg_block_time=" + l3 + " str_app_version=" + this.i + " u32_isp2p=" + this.k + " u32_avg_load=" + TXCStatus.b(this.x, 2001) + " u32_load_cnt=" + TXCStatus.b(this.x, 2002) + " u32_max_load=" + TXCStatus.b(this.x, 2003) + " u32_first_i_frame=" + this.j + " u32_speed_cnt=" + TXCStatus.b(this.x, 2004) + " u32_nodata_cnt=" + TXCStatus.b(this.x, 2005) + " u32_avg_cache_time=" + TXCStatus.b(this.x, 2007) + " u32_is_real_time=" + TXCStatus.b(this.x, 2008));
    AppMethodBeat.o(67692);
  }

  private void l()
  {
    AppMethodBeat.i(67693);
    Object localObject = new TXCDRExtInfo();
    ((TXCDRExtInfo)localObject).url = this.c;
    ((TXCDRExtInfo)localObject).report_common = false;
    ((TXCDRExtInfo)localObject).report_status = true;
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.aa, a.ar, (TXCDRExtInfo)localObject);
    int i1 = TXCStatus.d(this.x, 7102);
    int i2 = TXCStatus.d(this.x, 7101);
    TXCDRApi.txSetEventIntValue(str, a.aa, "u32_avg_net_speed", i1 + i2);
    double d1 = TXCStatus.e(this.x, 6002);
    TXCDRApi.txSetEventIntValue(str, a.aa, "u32_fps", (int)d1);
    long l1 = TXCStatus.b(this.x, 6004);
    if ((this.l != -1L) && (l1 >= this.l))
      TXCDRApi.txSetEventIntValue(str, a.aa, "u32_avg_block_count", l1 - this.l);
    while (true)
    {
      this.l = l1;
      localObject = com.tencent.liteav.basic.util.b.a();
      i1 = com.tencent.liteav.basic.util.b.b();
      l1 = TXCStatus.b(this.x, 2006);
      TXCDRApi.txSetEventIntValue(str, a.aa, "u32_avg_cache_count", l1);
      TXCDRApi.txSetEventIntValue(str, a.aa, "u32_cpu_usage", localObject[1]);
      TXCDRApi.txSetEventIntValue(str, a.aa, "u32_app_cpu_usage", localObject[0]);
      TXCDRApi.txSetEventIntValue(str, a.aa, "u32_app_mem_usage", i1);
      TXCDRApi.txSetEventValue(str, a.aa, "str_app_version", this.i);
      TXCDRApi.txSetEventIntValue(str, a.aa, "u32_isp2p", this.k);
      TXCDRApi.nativeReportEvent(str, a.aa);
      if (this.p)
      {
        this.t += 1L;
        this.s += l1;
        if (l1 > this.r)
          this.r = l1;
      }
      AppMethodBeat.o(67693);
      return;
      TXCDRApi.txSetEventIntValue(str, a.aa, "u32_avg_block_count", 0L);
    }
  }

  private void m()
  {
    AppMethodBeat.i(67694);
    Object localObject1 = new HashMap();
    Object localObject2 = TXCStatus.c(this.x, 7113);
    String str1 = TXCStatus.c(this.x, 7114);
    String str2 = TXCStatus.c(this.x, 7115);
    int i1 = TXCStatus.d(this.x, 7105);
    Object localObject3 = TXCStatus.c(this.x, 7106);
    int i2 = TXCStatus.d(this.x, 7111);
    ((Map)localObject1).put("stream_url", localObject2);
    ((Map)localObject1).put("stream_id", str1);
    ((Map)localObject1).put("bizid", str2);
    ((Map)localObject1).put("err_code", String.valueOf(i1));
    ((Map)localObject1).put("err_info", localObject3);
    ((Map)localObject1).put("channel_type", String.valueOf(i2));
    long l1 = System.currentTimeMillis();
    long l2 = this.q;
    ((Map)localObject1).put("start_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.q)));
    ((Map)localObject1).put("end_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(l1)));
    ((Map)localObject1).put("total_time", String.valueOf(l1 - l2));
    long l3 = TXCStatus.b(this.x, 6003);
    l1 = TXCStatus.b(this.x, 6006);
    l2 = TXCStatus.b(this.x, 6005);
    if (l3 != 0L);
    for (l1 /= l3; ; l1 = 0L)
    {
      ((Map)localObject1).put("block_count", String.valueOf(l3));
      ((Map)localObject1).put("block_duration_max", String.valueOf(l2));
      ((Map)localObject1).put("block_duration_avg", String.valueOf(l1));
      if (this.t != 0L);
      for (l1 = this.s / this.t; ; l1 = 0L)
      {
        ((Map)localObject1).put("jitter_cache_max", String.valueOf(this.r));
        ((Map)localObject1).put("jitter_cache_avg", String.valueOf(l1));
        str1 = TXCDRApi.txCreateToken();
        i1 = a.ak;
        i2 = a.aq;
        localObject3 = new TXCDRExtInfo();
        ((TXCDRExtInfo)localObject3).command_id_comment = "LINKMIC";
        TXCDRApi.InitEvent(this.h, str1, i1, i2, (TXCDRExtInfo)localObject3);
        TXCLog.d(a, "report evt 40402: token=".concat(String.valueOf(str1)));
        localObject1 = ((Map)localObject1).entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          localObject3 = (String)((Map.Entry)localObject2).getKey();
          localObject2 = (String)((Map.Entry)localObject2).getValue();
          TXCLog.e(a, "RealTimePlayStatisticInfo: " + (String)localObject3 + " = " + (String)localObject2);
          if ((localObject3 != null) && (((String)localObject3).length() > 0) && (localObject2 != null))
            TXCDRApi.txSetEventValue(str1, i1, (String)localObject3, (String)localObject2);
        }
        TXCDRApi.nativeReportEvent(str1, i1);
        this.p = false;
        this.q = 0L;
        this.t = 0L;
        this.s = 0L;
        this.r = 0L;
        AppMethodBeat.o(67694);
        return;
      }
    }
  }

  private void n()
  {
    AppMethodBeat.i(67695);
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    localTXCDRExtInfo.url = this.c;
    long l1 = TXCStatus.b(this.x, 7013);
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.U, a.aq, localTXCDRExtInfo);
    long l2 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, a.U, "u64_timestamp", TXCTimeUtil.getUtcTimeTick());
    TXCDRApi.txSetEventValue(str, a.U, "str_device_type", (String)this.b.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, a.U, "u32_network_type", e("u32_network_type"));
    TXCDRApi.txSetEventIntValue(str, a.U, "u32_dns_time", -1L);
    TXCDRApi.txSetEventIntValue(str, a.U, "u32_connect_server_time", -1L);
    TXCDRApi.txSetEventValue(str, a.U, "u32_server_ip", "");
    TXCDRApi.txSetEventIntValue(str, a.U, "u32_video_resolution", this.d << 16 | this.e);
    TXCDRApi.txSetEventIntValue(str, a.U, "u32_audio_samplerate", this.g);
    TXCDRApi.txSetEventIntValue(str, a.U, "u32_video_bitrate", this.f);
    TXCDRApi.txSetEventValue(str, a.U, "str_user_id", (String)this.b.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, a.U, "str_package_name", (String)this.b.get("str_package_name"));
    TXCDRApi.txSetEventIntValue(str, a.U, "u32_channel_type", l1);
    TXCDRApi.txSetEventValue(str, a.U, "str_app_version", this.i);
    TXCDRApi.txSetEventValue(str, a.U, "dev_uuid", (String)this.b.get("dev_uuid"));
    TXCDRApi.nativeReportEvent(str, a.U);
    TXCLog.d(a, "report evt 40001: token=" + str + " str_stream_url=" + this.c + " u64_timestamp=" + l2 + " str_device_type=" + this.b.get("str_device_type") + " u32_network_type=" + e("u32_network_type") + " u32_dns_time=-1 u32_connect_server_time=-1 u32_server_ip= u32_video_resolution=" + (this.d << 16 | this.e) + " u32_audio_samplerate=" + this.g + " u32_video_bitrate=" + this.f + " str_user_id=" + this.b.get("str_user_id") + " str_package_name=" + this.b.get("str_package_name") + " u32_channel_type=" + l1 + " str_app_version=" + this.b.get("dev_uuid") + " dev_uuid=" + e("u32_max_load"));
    AppMethodBeat.o(67695);
  }

  private void o()
  {
    AppMethodBeat.i(67696);
    Object localObject = new TXCDRExtInfo();
    ((TXCDRExtInfo)localObject).report_common = false;
    ((TXCDRExtInfo)localObject).report_status = false;
    ((TXCDRExtInfo)localObject).url = this.c;
    String str1 = TXCStatus.c(this.x, 7012);
    long l1 = TXCStatus.b(this.x, 7009);
    long l2 = TXCStatus.b(this.x, 7010);
    if (l2 != -1L)
      l2 -= l1;
    while (true)
    {
      long l3 = TXCStatus.b(this.x, 7011);
      if (l3 != -1L)
        l3 -= l1;
      while (true)
      {
        l1 = TXCStatus.b(this.x, 7013);
        String str2 = (String)this.b.get("token");
        TXCDRApi.InitEvent(this.h, str2, a.U, a.aq, (TXCDRExtInfo)localObject);
        long l4 = TXCTimeUtil.getUtcTimeTick();
        TXCDRApi.txSetEventIntValue(str2, a.U, "u64_timestamp", l4);
        TXCDRApi.txSetEventValue(str2, a.U, "str_device_type", (String)this.b.get("str_device_type"));
        TXCDRApi.txSetEventIntValue(str2, a.U, "u32_network_type", e("u32_network_type"));
        TXCDRApi.txSetEventIntValue(str2, a.U, "u32_dns_time", l2);
        TXCDRApi.txSetEventIntValue(str2, a.U, "u32_connect_server_time", l3);
        TXCDRApi.txSetEventValue(str2, a.U, "u32_server_ip", str1);
        TXCDRApi.txSetEventIntValue(str2, a.U, "u32_video_resolution", this.d << 16 | this.e);
        TXCDRApi.txSetEventIntValue(str2, a.U, "u32_audio_samplerate", this.g);
        TXCDRApi.txSetEventIntValue(str2, a.U, "u32_video_bitrate", this.f);
        TXCDRApi.txSetEventValue(str2, a.U, "str_user_id", (String)this.b.get("str_user_id"));
        TXCDRApi.txSetEventValue(str2, a.U, "str_package_name", (String)this.b.get("str_package_name"));
        TXCDRApi.txSetEventIntValue(str2, a.U, "u32_channel_type", l1);
        TXCDRApi.txSetEventValue(str2, a.U, "str_app_version", this.i);
        TXCDRApi.txSetEventValue(str2, a.U, "dev_uuid", (String)this.b.get("dev_uuid"));
        localObject = TXCStatus.c(this.x, 7019);
        TXCDRApi.txSetEventValue(str2, a.U, "str_nearest_ip_list", (String)localObject);
        TXCDRApi.nativeReportEvent(str2, a.U);
        TXCLog.d(a, "report evt 40001: token=" + str2 + " str_stream_url=" + this.c + " u64_timestamp=" + l4 + " str_device_type=" + this.b.get("str_device_type") + " u32_network_type=" + e("u32_network_type") + " u32_dns_time=" + l2 + " u32_connect_server_time=" + l3 + " u32_server_ip=" + str1 + " u32_video_resolution=" + (this.d << 16 | this.e) + " u32_audio_samplerate=" + this.g + " u32_video_bitrate=" + this.f + " str_user_id=" + this.b.get("str_user_id") + " str_package_name=" + this.b.get("str_package_name") + " u32_channel_type=" + l1 + " str_app_version=" + this.b.get("dev_uuid") + " dev_uuid=" + e("u32_max_load"));
        AppMethodBeat.o(67696);
        return;
      }
    }
  }

  private void p()
  {
    AppMethodBeat.i(67697);
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    localTXCDRExtInfo.url = this.c;
    long l1 = TXCStatus.b(this.x, 7009);
    long l2 = TXCStatus.b(this.x, 7013);
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.W, a.aq, localTXCDRExtInfo);
    long l3 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, a.W, "u64_timestamp", l3);
    l1 = (TXCTimeUtil.getTimeTick() - l1) / 1000L;
    TXCDRApi.txSetEventIntValue(str, a.W, "u32_result", l1);
    TXCDRApi.txSetEventValue(str, a.W, "str_user_id", (String)this.b.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, a.W, "str_package_name", (String)this.b.get("str_package_name"));
    TXCDRApi.txSetEventIntValue(str, a.W, "u32_channel_type", l2);
    TXCDRApi.txSetEventValue(str, a.W, "str_app_version", this.i);
    TXCDRApi.txSetEventValue(str, a.W, "dev_uuid", (String)this.b.get("dev_uuid"));
    int i1 = TXCStatus.d(this.x, 7016);
    TXCDRApi.txSetEventValue(str, a.W, "u32_ip_count_quic", String.valueOf(i1));
    i1 = TXCStatus.d(this.x, 7017);
    TXCDRApi.txSetEventValue(str, a.W, "u32_connect_count_quic", String.valueOf(i1));
    i1 = TXCStatus.d(this.x, 7018);
    TXCDRApi.txSetEventValue(str, a.W, "u32_connect_count_tcp", String.valueOf(i1));
    TXCDRApi.nativeReportEvent(str, a.W);
    TXCLog.d(a, "report evt 40002: token=" + str + " str_stream_url=" + this.c + " u64_timestamp=" + l3 + " u32_result=" + l1 + " str_user_id=" + this.b.get("str_user_id") + " str_package_name=" + this.b.get("str_package_name") + " u32_channel_type=" + l2 + " str_app_version=" + this.i + " dev_uuid=" + this.b.get("dev_uuid"));
    AppMethodBeat.o(67697);
  }

  private void q()
  {
    AppMethodBeat.i(67698);
    Object localObject1 = new TXCDRExtInfo();
    ((TXCDRExtInfo)localObject1).report_common = false;
    ((TXCDRExtInfo)localObject1).report_status = true;
    ((TXCDRExtInfo)localObject1).url = this.c;
    Object localObject2 = com.tencent.liteav.basic.util.b.a();
    int i1 = localObject2[0];
    int i2 = localObject2[1];
    int i3 = com.tencent.liteav.basic.util.b.b();
    long l1 = TXCStatus.b(this.x, 7013);
    int i4 = TXCStatus.d(this.x, 7004);
    int i5 = TXCStatus.d(this.x, 7003);
    double d1 = TXCStatus.e(this.x, 4001);
    int i6 = TXCStatus.d(this.x, 7005);
    int i7 = TXCStatus.d(this.x, 7002);
    int i8 = TXCStatus.d(this.x, 7001);
    int i9 = TXCStatus.d(this.x, 4004);
    String str1 = TXCStatus.c(this.x, 7012);
    String str2 = TXCStatus.c(this.x, 7014);
    localObject2 = TXCStatus.c(this.x, 7015);
    String str3 = TXCStatus.c(this.x, 3001);
    long l2 = TXCStatus.b(this.x, 3002);
    double d2 = TXCStatus.e(this.x, 3003);
    int i10 = TXCStatus.d(this.x, 7020);
    String str4 = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str4, a.V, a.aq, (TXCDRExtInfo)localObject1);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_avg_audio_bitrate", i7);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_avg_video_bitrate", i8);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_avg_net_speed", i4 + i5);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_fps", (int)d1);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_avg_cache_size", i6);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_cpu_usage", i2);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_app_cpu_usage", i1);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_app_mem_usage", i3);
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_channel_type", l1);
    TXCDRApi.txSetEventValue(str4, a.V, "str_app_version", this.i);
    TXCDRApi.txSetEventValue(str4, a.V, "str_device_type", (String)this.b.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str4, a.V, "u32_hw_enc", i9);
    try
    {
      if ((this.h != null) && (com.tencent.liteav.basic.util.b.c(this.h) == 1))
      {
        localObject1 = (WifiManager)this.h.getSystemService("wifi");
        if (localObject1 != null)
        {
          localObject1 = ((WifiManager)localObject1).getConnectionInfo();
          if (localObject1 != null)
          {
            TXCDRApi.txSetEventValue(str4, a.V, "str_wifi_ssid", ((WifiInfo)localObject1).getSSID());
            TXCDRApi.txSetEventIntValue(str4, a.V, "str_wifi_signal_strength", WifiManager.calculateSignalLevel(((WifiInfo)localObject1).getRssi(), 32));
            TXCDRApi.txSetEventIntValue(str4, a.V, "str_wifi_link_speed", ((WifiInfo)localObject1).getLinkSpeed());
          }
        }
      }
      label533: TXCDRApi.txSetEventValue(str4, a.V, "str_server_ip", str1);
      TXCDRApi.txSetEventValue(str4, a.V, "str_quic_connection_id", str2);
      TXCDRApi.txSetEventValue(str4, a.V, "str_quic_connection_stats", (String)localObject2);
      TXCDRApi.txSetEventValue(str4, a.V, "str_beauty_stats", str3);
      TXCDRApi.txSetEventIntValue(str4, a.V, "u32_send_strategy", i10);
      TXCDRApi.txSetEventIntValue(str4, a.V, "u32_preprocess_timecost", l2);
      TXCDRApi.txSetEventIntValue(str4, a.V, "u32_preprocess_fps_out", (int)d2);
      TXCDRApi.nativeReportEvent(str4, a.V);
      AppMethodBeat.o(67698);
      return;
    }
    catch (Exception localException)
    {
      break label533;
    }
  }

  private void r()
  {
    AppMethodBeat.i(67700);
    this.m = false;
    this.n = 0L;
    this.b.put("str_user_id", com.tencent.liteav.basic.util.b.a(this.h));
    this.b.put("str_device_type", com.tencent.liteav.basic.util.b.c());
    this.b.put("str_device_type", com.tencent.liteav.basic.util.b.c());
    this.b.put("u32_network_type", Integer.valueOf(com.tencent.liteav.basic.util.b.c(this.h)));
    this.b.put("token", com.tencent.liteav.basic.util.b.d());
    this.b.put("str_package_name", com.tencent.liteav.basic.util.b.b(this.h));
    this.b.put("dev_uuid", com.tencent.liteav.basic.util.b.d(this.h));
    AppMethodBeat.o(67700);
  }

  private void s()
  {
    AppMethodBeat.i(67702);
    Object localObject = new TXCDRExtInfo();
    ((TXCDRExtInfo)localObject).url = this.c;
    ((TXCDRExtInfo)localObject).report_common = false;
    ((TXCDRExtInfo)localObject).report_status = false;
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.ae, a.ar, (TXCDRExtInfo)localObject);
    TXCDRApi.txSetEventValue(str, a.ae, "u64_begin_timestamp", String.valueOf(this.u));
    long l1 = TXCTimeUtil.getUtcTimeTick();
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_end_timestamp", l1);
    long l2 = (l1 - this.u) / 1000L;
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_playtime", l2);
    TXCDRApi.txSetEventValue(str, a.ae, "str_device_type", (String)this.b.get("str_device_type"));
    TXCDRApi.txSetEventIntValue(str, a.ae, "u32_network_type", e("u32_network_type"));
    localObject = TXCStatus.c(this.x, 7110);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_server_ip", (String)localObject);
    TXCDRApi.txSetEventValue(str, a.ae, "str_user_id", (String)this.b.get("str_user_id"));
    TXCDRApi.txSetEventValue(str, a.ae, "str_package_name", (String)this.b.get("str_package_name"));
    TXCDRApi.txSetEventValue(str, a.ae, "str_app_version", this.i);
    TXCDRApi.txSetEventValue(str, a.ae, "dev_uuid", (String)this.b.get("dev_uuid"));
    long l3 = TXCStatus.b(this.x, 6003);
    long l4 = TXCStatus.b(this.x, 6005);
    long l5 = TXCStatus.b(this.x, 6006);
    long l6 = 0L;
    if (l3 > 0L)
      l6 = l5 / l3;
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_block_count", l3);
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_block_duration_max", l4);
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_block_duration_avg", l6);
    long l7 = TXCStatus.b(this.x, 6009);
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_jitter_cache_max", l7);
    l5 = TXCStatus.b(this.x, 6008);
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_jitter_cache_avg", l5);
    long l8 = TXCStatus.b(this.x, 2007);
    TXCDRApi.txSetEventIntValue(str, a.ae, "u64_audio_cache_avg", l8);
    int i1 = TXCStatus.d(this.x, 7112);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_link_type", String.valueOf(i1));
    long l9 = TXCStatus.d(this.x, 2001);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_avg_load", String.valueOf(l9));
    long l10 = TXCStatus.d(this.x, 2002);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_load_cnt", String.valueOf(l10));
    long l11 = TXCStatus.d(this.x, 2003);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_max_load", String.valueOf(l11));
    int i2 = TXCStatus.d(this.x, 7111);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_channel_type", String.valueOf(i2));
    int i3 = TXCStatus.d(this.x, 7116);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_ip_count_quic", String.valueOf(i3));
    i3 = TXCStatus.d(this.x, 7117);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_connect_count_quic", String.valueOf(i3));
    i3 = TXCStatus.d(this.x, 7118);
    TXCDRApi.txSetEventValue(str, a.ae, "u32_connect_count_tcp", String.valueOf(i3));
    TXCDRApi.nativeReportEvent(str, a.ae);
    TXCLog.d(a, "report evt 40502: token=" + str + " str_stream_url=" + this.c + " u64_begin_timestamp=" + this.u + " u64_end_timestamp=" + l1 + " u64_playtime=" + l2 + " str_device_type=" + (String)this.b.get("str_device_type") + " u32_network_type=" + e("u32_network_type") + " u32_server_ip=" + (String)localObject + " str_user_id=" + (String)this.b.get("str_user_id") + " str_package_name=" + (String)this.b.get("str_package_name") + " str_app_version=" + this.i + " dev_uuid=" + (String)this.b.get("dev_uuid") + " u64_block_count=" + l3 + " u64_block_duration_max=" + l4 + " u64_block_duration_avg=" + l6 + " u64_jitter_cache_max=" + l7 + " u64_jitter_cache_avg=" + l5 + " u64_audio_cache_avg=" + l8 + " u32_link_type=" + i1 + " u32_avg_load=" + l9 + " u32_load_cnt=" + l10 + " u32_max_load=" + l11 + " u32_channel_type=" + i2);
    AppMethodBeat.o(67702);
  }

  private void t()
  {
    int i1 = 2;
    AppMethodBeat.i(67703);
    Object localObject = new TXCDRExtInfo();
    ((TXCDRExtInfo)localObject).url = this.c;
    ((TXCDRExtInfo)localObject).report_common = false;
    ((TXCDRExtInfo)localObject).report_status = true;
    String str = (String)this.b.get("token");
    TXCDRApi.InitEvent(this.h, str, a.ad, a.ar, (TXCDRExtInfo)localObject);
    int i2 = TXCStatus.d(this.x, 7102);
    int i3 = TXCStatus.d(this.x, 7101);
    TXCDRApi.txSetEventIntValue(str, a.ad, "u32_net_speed", i2 + i3);
    double d1 = TXCStatus.e(this.x, 6002);
    TXCDRApi.txSetEventIntValue(str, a.ad, "u32_fps", (int)d1);
    long l1 = TXCStatus.b(this.x, 6004);
    if ((this.l != -1L) && (l1 >= this.l))
    {
      TXCDRApi.txSetEventIntValue(str, a.ad, "u32_video_block_count", l1 - this.l);
      this.l = l1;
      l1 = TXCStatus.b(this.x, 2006);
      TXCDRApi.txSetEventIntValue(str, a.ad, "u32_video_cache_count", l1);
      localObject = com.tencent.liteav.basic.util.b.a();
      TXCDRApi.txSetEventIntValue(str, a.ad, "u32_cpu_usage", localObject[1]);
      TXCDRApi.txSetEventIntValue(str, a.ad, "u32_app_cpu_usage", localObject[0]);
      i2 = com.tencent.liteav.basic.util.b.b();
      TXCDRApi.txSetEventIntValue(str, a.ad, "u32_app_mem_usage", i2);
      TXCDRApi.txSetEventValue(str, a.ad, "str_app_version", this.i);
      TXCDRApi.txSetEventValue(str, a.ad, "str_device_type", (String)this.b.get("str_device_type"));
      if (TXCStatus.d(this.x, 5002) != 0)
        break label581;
    }
    label581: for (i2 = 2; ; i2 = 1)
    {
      TXCDRApi.txSetEventIntValue(str, a.ad, "u32_video_decode_type", i2);
      if (TXCStatus.d(this.x, 2015) == 0);
      for (i2 = i1; ; i2 = 1)
      {
        TXCDRApi.txSetEventIntValue(str, a.ad, "u32_audio_decode_type", i2);
        TXCDRApi.txSetEventIntValue(str, a.ad, "u32_network_type", e("u32_network_type"));
        i2 = TXCStatus.d(this.x, 6007);
        TXCDRApi.txSetEventIntValue(str, a.ad, "u32_video_cache_time", i2);
        i2 = TXCStatus.d(this.x, 2010);
        TXCDRApi.txSetEventIntValue(str, a.ad, "u32_audio_cache_time", i2);
        i2 = TXCStatus.d(this.x, 2011);
        TXCDRApi.txSetEventIntValue(str, a.ad, "u32_audio_jitter", i2);
        i2 = TXCStatus.d(this.x, 2014);
        TXCDRApi.txSetEventIntValue(str, a.ad, "u32_audio_drop", i2);
        l1 = (TXCTimeUtil.getUtcTimeTick() - this.u) / 1000L;
        TXCDRApi.txSetEventValue(str, a.ad, "u64_playtime", String.valueOf(l1));
        i2 = TXCStatus.d(this.x, 7112);
        TXCDRApi.txSetEventValue(str, a.ad, "u32_link_type", String.valueOf(i2));
        i2 = TXCStatus.d(this.x, 7111);
        TXCDRApi.txSetEventValue(str, a.ad, "u32_channel_type", String.valueOf(i2));
        TXCDRApi.nativeReportEvent(str, a.ad);
        AppMethodBeat.o(67703);
        return;
        TXCDRApi.txSetEventIntValue(str, a.ad, "u32_video_block_count", 0L);
        break;
      }
    }
  }

  public void a()
  {
    AppMethodBeat.i(67682);
    r();
    this.l = -1L;
    this.q = System.currentTimeMillis();
    AppMethodBeat.o(67682);
  }

  public void a(int paramInt)
  {
    this.f = paramInt;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.d = paramInt1;
    this.e = paramInt2;
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(67685);
    this.c = paramString;
    b(paramString);
    AppMethodBeat.o(67685);
  }

  public void a(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }

  public void b()
  {
    AppMethodBeat.i(67683);
    if (this.m)
    {
      p();
      AppMethodBeat.o(67683);
    }
    while (true)
    {
      return;
      TXCLog.e(a, "push " + this.c + " failed!");
      n();
      AppMethodBeat.o(67683);
    }
  }

  public void b(int paramInt)
  {
    this.g = paramInt;
  }

  public void b(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return;
      this.v = paramString;
    }
  }

  public void c()
  {
    AppMethodBeat.i(67684);
    if (this.m)
      if (this.p)
        s();
    while (true)
    {
      if (this.p)
        m();
      AppMethodBeat.o(67684);
      return;
      k();
      continue;
      TXCLog.e(a, "play " + this.c + " failed");
      if (this.p)
        b(false);
      else
        j();
    }
  }

  protected d.a d()
  {
    AppMethodBeat.i(67686);
    try
    {
      Object localObject1 = Uri.parse(this.v);
      Object localObject2;
      if (localObject1 == null)
      {
        localObject2 = d.a.a;
        AppMethodBeat.o(67686);
      }
      while (true)
      {
        return localObject2;
        localObject2 = ((Uri)localObject1).getHost();
        if (TextUtils.isEmpty((CharSequence)localObject2))
        {
          localObject2 = d.a.a;
          AppMethodBeat.o(67686);
        }
        else
        {
          Object localObject3 = ((Uri)localObject1).getScheme();
          if (localObject3 == null)
          {
            localObject2 = d.a.a;
            AppMethodBeat.o(67686);
          }
          else if ((!((String)localObject3).equals("rtmp")) && (!((String)localObject3).equals("http")) && (!((String)localObject3).equals("https")))
          {
            localObject2 = d.a.a;
            AppMethodBeat.o(67686);
          }
          else if (c((String)localObject2))
          {
            localObject2 = d.a.b;
            AppMethodBeat.o(67686);
          }
          else
          {
            localObject1 = ((Uri)localObject1).getQueryParameterNames();
            if ((localObject1 != null) && ((((Set)localObject1).contains("bizid")) || (((Set)localObject1).contains("txTime")) || (((Set)localObject1).contains("txSecret"))))
            {
              localObject2 = d.a.b;
              AppMethodBeat.o(67686);
            }
            else if (w.containsKey(localObject2))
            {
              localObject2 = (d.a)w.get(localObject2);
              AppMethodBeat.o(67686);
            }
            else
            {
              w.put(localObject2, d.a.a);
              localObject1 = new java/lang/Thread;
              localObject3 = new com/tencent/liteav/d$1;
              ((d.1)localObject3).<init>(this, (String)localObject2);
              ((Thread)localObject1).<init>((Runnable)localObject3);
              ((Thread)localObject1).start();
              label262: localObject2 = d.a.a;
              AppMethodBeat.o(67686);
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      break label262;
    }
  }

  public void d(String paramString)
  {
    this.x = paramString;
  }

  public void e()
  {
    AppMethodBeat.i(67688);
    if ((!this.m) && (!TextUtils.isEmpty(TXCStatus.c(this.x, 7012))))
    {
      o();
      this.m = true;
    }
    if (this.n <= 0L)
      this.n = TXCTimeUtil.getTimeTick();
    if ((this.m) && (TXCTimeUtil.getTimeTick() - this.n > 5000L))
    {
      q();
      this.n = TXCTimeUtil.getTimeTick();
    }
    AppMethodBeat.o(67688);
  }

  public void f()
  {
    AppMethodBeat.i(67689);
    if (!this.m)
    {
      long l1 = TXCStatus.b(this.x, 6001);
      long l2 = TXCStatus.b(this.x, 7104);
      if ((l1 != 0L) || (l2 != 0L))
      {
        if (!this.p)
          break label180;
        b(true);
        this.o = 5000;
        this.m = true;
      }
      String str = TXCStatus.c(this.x, 7119);
      if (str != null)
        b(str);
    }
    if (this.n <= 0L)
      this.n = TXCTimeUtil.getTimeTick();
    if ((this.m) && (TXCTimeUtil.getTimeTick() > this.n + this.o))
    {
      if (!this.p)
        break label187;
      t();
      this.o = 5000;
    }
    while (true)
    {
      this.l = TXCStatus.b(this.x, 6004);
      this.n = TXCTimeUtil.getTimeTick();
      AppMethodBeat.o(67689);
      while (true)
      {
        return;
        label180: i();
        break;
        label187: if (d() != d.a.c)
          break label206;
        AppMethodBeat.o(67689);
      }
      label206: l();
      this.o = TXCDRApi.getStatusReportInterval();
      if (this.o < 5000)
        this.o = 5000;
      if (this.o > 300000)
        this.o = 300000;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.d
 * JD-Core Version:    0.6.2
 */