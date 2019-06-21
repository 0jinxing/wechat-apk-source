package com.tencent.mm.wallet_core.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.wallet_core.ui.e;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class q extends u
{
  protected int AfF = 0;
  protected int AfG = 0;
  private String AfH = "";
  public String AfI = "";
  public String AfJ = "";
  protected boolean AfK = false;
  protected String AfL;
  public boolean AfM = false;
  private Map<String, String> AfN = new HashMap();
  public boolean AfO = false;
  protected com.tencent.mm.ai.b ehh;
  protected com.tencent.mm.ai.f ehi;
  public k nYe;
  public int tyd = 0;
  public String tye = "";
  public int tyf = 0;
  public String tyg = "";
  public int tyh = 0;

  public static void a(int paramInt1, int paramInt2, String paramString, d paramd)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.w("MicroMsg.NetScenePayBase", "hy: resolve system error.");
      paramString = br.z(paramString, "e");
      if (paramString == null)
        break label49;
      ab.d("MicroMsg.NetScenePayBase", "hy: CDN error!");
      paramd.aIm = ((String)paramString.get(".e.Content"));
    }
    while (true)
    {
      return;
      label49: if ((paramInt2 == -1) || (paramInt2 == -500))
      {
        ab.w("MicroMsg.NetScenePayBase", "hy: network error");
        paramd.aIm = ah.getContext().getString(2131305019);
      }
      else
      {
        ab.w("MicroMsg.NetScenePayBase", "hy: unknown system error");
        paramd.aIm = ah.getContext().getString(2131304763);
      }
    }
  }

  public final void M(Map<String, String> paramMap)
  {
    Object localObject1 = paramMap;
    if (paramMap == null)
      localObject1 = new HashMap();
    if (localObject1 != null)
      ((Map)localObject1).remove("uin");
    if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
      ((Map)localObject1).put("jsapi_reqkey", com.tencent.mm.pluginsdk.wallet.f.dlI());
    this.AfN = ((Map)localObject1);
    U(true, true);
    paramMap = (String)((Map)localObject1).get("req_key");
    this.ehh.acF().fsO = e.atB(paramMap);
    StringBuilder localStringBuilder;
    if (localObject1 != null)
    {
      Object[] arrayOfObject = ((Map)localObject1).keySet().toArray();
      Arrays.sort(arrayOfObject);
      localStringBuilder = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < arrayOfObject.length; j = k)
      {
        Object localObject2 = arrayOfObject[i];
        paramMap = (String)((Map)localObject1).get(localObject2);
        k = j;
        if (!bo.isNullOrNil(paramMap))
        {
          if (j != 0)
            localStringBuilder.append("&");
          localStringBuilder.append(localObject2);
          localStringBuilder.append("=");
          b(localStringBuilder, paramMap);
          k = 1;
        }
        i++;
      }
      if (!com.tencent.mm.sdk.a.b.dnO())
        break label400;
      ab.v("MicroMsg.NetScenePayBase", "RQ: Cmd : " + cOo() + ", req = " + localStringBuilder.toString() + " " + toString() + " " + bo.dpG().toString());
      localObject1 = acv(localStringBuilder.toString());
      if (j == 0)
        break label452;
    }
    label400: label452: for (paramMap = "&"; ; paramMap = "")
    {
      localStringBuilder.append(paramMap);
      localStringBuilder.append("WCPaySign");
      localStringBuilder.append("=");
      localStringBuilder.append((String)localObject1);
      paramMap = localStringBuilder.toString().getBytes();
      paramMap = new SKBuiltinBuffer_t().setBuffer(paramMap);
      a(this.ehh, paramMap);
      ab.i("MicroMsg.NetScenePayBase", "setRequestData getPayCgicmd: %s type: %s this: %s cgi %s ", new Object[] { Integer.valueOf(cOo()), Integer.valueOf(getType()), toString(), this.ehh.uri });
      return;
      ab.i("MicroMsg.NetScenePayBase", "RQ: Cmd : " + cOo() + ", req = " + localStringBuilder.toString() + " " + toString());
      break;
    }
  }

  public abstract void U(boolean paramBoolean1, boolean paramBoolean2);

  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);

  public abstract void a(com.tencent.mm.ai.b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t);

  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2)
  {
    a(paramPayInfo, paramMap1, paramMap2, false);
  }

  public final void a(PayInfo paramPayInfo, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    Object localObject = paramMap2;
    if (paramMap2 == null)
      localObject = new HashMap();
    if (paramPayInfo == null)
    {
      ab.e("MicroMsg.NetScenePayBase", "Cmd : " + cOo() + ", payInfo is null");
      ((Map)localObject).put("devicename", Build.MODEL);
      ba((Map)localObject);
      return;
    }
    paramMap1.put("req_key", paramPayInfo.czZ);
    paramMap1.put("partner_id", paramPayInfo.partnerId);
    paramMap1.put("pay_sign", paramPayInfo.cQF);
    if (paramPayInfo.vwk >= 0)
      paramMap1.put("auto_deduct_flag", paramPayInfo.vwk);
    if (paramPayInfo.cIf > 0)
      paramMap1.put("pay_scene", paramPayInfo.cIf);
    if (paramPayInfo.cIg >= 0)
      paramMap1.put("bindbankscene", paramPayInfo.cIg);
    if (!bo.isNullOrNil(paramPayInfo.vwl))
      paramMap1.put("deduct_bank_type", paramPayInfo.vwl);
    if (!bo.isNullOrNil(paramPayInfo.vwm))
      paramMap1.put("deduct_bind_serial", paramPayInfo.vwm);
    if (paramBoolean)
      paramMap1.put("use_touch", "0");
    while (true)
    {
      paramMap1.put("fp_identify_num", paramPayInfo.tKe);
      if (!TextUtils.isEmpty(paramPayInfo.cBU))
        paramMap1.put("encrypted_pay_info", URLEncoder.encode(paramPayInfo.cBU));
      if (!TextUtils.isEmpty(paramPayInfo.cBV))
        paramMap1.put("encrypted_rsa_sign", URLEncoder.encode(paramPayInfo.cBV));
      ((Map)localObject).put("uuid", paramPayInfo.eCq);
      ((Map)localObject).put("appid", paramPayInfo.appId);
      ((Map)localObject).put("appsource", paramPayInfo.tRb);
      ((Map)localObject).put("channel", paramPayInfo.cIb);
      ((Map)localObject).put("devicename", Build.MODEL);
      ((Map)localObject).put("soter_req", paramPayInfo.cHI);
      break;
      paramMap1.put("use_touch", paramPayInfo.tKd);
    }
  }

  public void a(d paramd, JSONObject paramJSONObject)
  {
  }

  public final void aZ(Map<String, String> paramMap)
  {
    Object localObject1 = paramMap;
    if (paramMap == null)
      localObject1 = new HashMap();
    if (localObject1 != null)
      ((Map)localObject1).remove("uin");
    if (this.AfN == null)
      this.AfN = new HashMap();
    if (this.AfN != null)
      this.AfN.remove("uin");
    Object[] arrayOfObject = ((Map)localObject1).keySet().toArray();
    for (int i = 0; i < arrayOfObject.length; i++)
    {
      Object localObject2 = arrayOfObject[i];
      paramMap = (String)((Map)localObject1).get(localObject2);
      if (this.AfN.containsKey(localObject2))
        this.AfN.remove(localObject2);
      this.AfN.put((String)localObject2, paramMap);
    }
    M(this.AfN);
  }

  public abstract String acv(String paramString);

  public abstract void b(com.tencent.mm.ai.b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t);

  public void b(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append(paramString);
  }

  public final boolean bLD()
  {
    if (this.nYe == null);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final int bLE()
  {
    return cOo();
  }

  public boolean bXl()
  {
    reset();
    return false;
  }

  public boolean bXm()
  {
    return true;
  }

  public final void ba(Map<String, String> paramMap)
  {
    U(false, false);
    if (paramMap != null)
    {
      Object localObject1 = com.tencent.mm.plugin.wallet_core.model.k.cPy();
      if (localObject1 != null)
      {
        ab.i("MicroMsg.NetScenePayBase", "location found");
        paramMap.put("province", ((aw)localObject1).duc);
        if (!paramMap.containsKey("city"))
          paramMap.put("city", ((aw)localObject1).dud);
        paramMap.put("location_timestamp", ((aw)localObject1).vCE);
        paramMap.put("encrypt_key", ((aw)localObject1).vCI);
        paramMap.put("encrypt_userinfo", ((aw)localObject1).vCH);
        if (com.tencent.mm.plugin.wallet_core.model.k.cPB())
          paramMap.put("encrypt_cellinfo", ((aw)localObject1).vCJ);
      }
      Object[] arrayOfObject = paramMap.keySet().toArray();
      Arrays.sort(arrayOfObject);
      localObject1 = new StringBuilder();
      int i = 0;
      int k;
      for (int j = 0; i < arrayOfObject.length; j = k)
      {
        Object localObject2 = arrayOfObject[i];
        String str = (String)paramMap.get(localObject2);
        k = j;
        if (!bo.isNullOrNil(str))
        {
          if (j != 0)
            ((StringBuilder)localObject1).append("&");
          ((StringBuilder)localObject1).append(localObject2);
          ((StringBuilder)localObject1).append("=");
          ((StringBuilder)localObject1).append(str);
          k = 1;
        }
        i++;
      }
      if (com.tencent.mm.sdk.a.b.dnO())
        ab.d("MicroMsg.NetScenePayBase", "Cmd : " + cOo() + ", wxreq = " + ((StringBuilder)localObject1).toString());
      ab.d("MicroMsg.NetScenePayBase", "wxreq: " + ((StringBuilder)localObject1).toString());
      paramMap = ((StringBuilder)localObject1).toString().getBytes();
      paramMap = new SKBuiltinBuffer_t().setBuffer(paramMap);
      b(this.ehh, paramMap);
    }
  }

  public boolean cOW()
  {
    return false;
  }

  public abstract int cOo();

  public boolean cfq()
  {
    return false;
  }

  public final com.tencent.mm.ai.b dNN()
  {
    return this.ehh;
  }

  public final boolean dNO()
  {
    if (this.AfH == null);
    for (boolean bool = false; ; bool = "1".equals(this.AfH.trim()))
      return bool;
  }

  public final String dNP()
  {
    return this.AfL;
  }

  public abstract v e(com.tencent.mm.ai.b paramb);

  // ERROR //
  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.network.q paramq)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield 36	com/tencent/mm/wallet_core/c/q:AfF	I
    //   5: aload_0
    //   6: iload_2
    //   7: putfield 38	com/tencent/mm/wallet_core/c/q:AfG	I
    //   10: iload_1
    //   11: istore 5
    //   13: iload_2
    //   14: istore 6
    //   16: getstatic 509	com/tencent/mm/platformtools/ae:gjr	Z
    //   19: ifeq +25 -> 44
    //   22: iload_1
    //   23: istore 5
    //   25: iload_2
    //   26: istore 6
    //   28: sipush 1686
    //   31: aload_0
    //   32: invokevirtual 228	com/tencent/mm/wallet_core/c/q:cOo	()I
    //   35: if_icmpne +9 -> 44
    //   38: iconst_3
    //   39: istore 5
    //   41: iconst_m1
    //   42: istore 6
    //   44: ldc 72
    //   46: ldc_w 511
    //   49: bipush 8
    //   51: anewarray 240	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload_0
    //   57: invokevirtual 282	com/tencent/mm/wallet_core/c/q:getType	()I
    //   60: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: aload 4
    //   68: invokeinterface 514 1 0
    //   73: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: aastore
    //   77: dup
    //   78: iconst_2
    //   79: aload 4
    //   81: invokeinterface 517 1 0
    //   86: aastore
    //   87: dup
    //   88: iconst_3
    //   89: aload_0
    //   90: invokevirtual 228	com/tencent/mm/wallet_core/c/q:cOo	()I
    //   93: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   96: aastore
    //   97: dup
    //   98: iconst_4
    //   99: iload 5
    //   101: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   104: aastore
    //   105: dup
    //   106: iconst_5
    //   107: iload 6
    //   109: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: aastore
    //   113: dup
    //   114: bipush 6
    //   116: aload_3
    //   117: aastore
    //   118: dup
    //   119: bipush 7
    //   121: aload_0
    //   122: invokevirtual 241	java/lang/Object:toString	()Ljava/lang/String;
    //   125: aastore
    //   126: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_0
    //   130: aload 4
    //   132: checkcast 159	com/tencent/mm/ai/b
    //   135: invokevirtual 519	com/tencent/mm/wallet_core/c/q:e	(Lcom/tencent/mm/ai/b;)Lcom/tencent/mm/wallet_core/c/v;
    //   138: astore 7
    //   140: aload 7
    //   142: getfield 524	com/tencent/mm/wallet_core/c/v:wxB	I
    //   145: istore 8
    //   147: aload 7
    //   149: getfield 527	com/tencent/mm/wallet_core/c/v:wxC	Ljava/lang/String;
    //   152: astore 9
    //   154: aload 7
    //   156: getfield 530	com/tencent/mm/wallet_core/c/v:AfP	I
    //   159: istore_2
    //   160: aload 7
    //   162: getfield 533	com/tencent/mm/wallet_core/c/v:luU	Ljava/lang/String;
    //   165: astore 10
    //   167: sipush -10088
    //   170: istore_1
    //   171: invokestatic 116	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   174: ldc 126
    //   176: invokevirtual 123	android/content/Context:getString	(I)Ljava/lang/String;
    //   179: astore 4
    //   181: aload 7
    //   183: getfield 537	com/tencent/mm/wallet_core/c/v:wxA	Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
    //   186: invokestatic 542	com/tencent/mm/platformtools/aa:b	(Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;)Ljava/lang/String;
    //   189: astore 7
    //   191: aload 7
    //   193: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   196: ifne +529 -> 725
    //   199: new 544	org/json/JSONObject
    //   202: astore 11
    //   204: aload 11
    //   206: aload 7
    //   208: invokespecial 545	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   211: aload_0
    //   212: aload 11
    //   214: ldc_w 547
    //   217: invokevirtual 550	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   220: putfield 500	com/tencent/mm/wallet_core/c/q:AfL	Ljava/lang/String;
    //   223: aload 11
    //   225: ldc_w 552
    //   228: invokevirtual 555	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   231: istore_1
    //   232: aload 11
    //   234: ldc_w 557
    //   237: invokevirtual 550	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   240: astore 7
    //   242: aload_0
    //   243: aload 11
    //   245: ldc_w 559
    //   248: invokevirtual 550	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   251: putfield 42	com/tencent/mm/wallet_core/c/q:AfH	Ljava/lang/String;
    //   254: aload_0
    //   255: aload 11
    //   257: ldc_w 561
    //   260: invokevirtual 550	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   263: putfield 44	com/tencent/mm/wallet_core/c/q:AfI	Ljava/lang/String;
    //   266: aload_0
    //   267: aload 11
    //   269: ldc_w 563
    //   272: invokevirtual 550	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   275: putfield 46	com/tencent/mm/wallet_core/c/q:AfJ	Ljava/lang/String;
    //   278: aload_0
    //   279: aload 11
    //   281: ldc_w 565
    //   284: invokevirtual 568	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   287: putfield 50	com/tencent/mm/wallet_core/c/q:tyd	I
    //   290: aload_0
    //   291: aload 11
    //   293: ldc_w 570
    //   296: invokevirtual 550	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   299: putfield 52	com/tencent/mm/wallet_core/c/q:tye	Ljava/lang/String;
    //   302: aload_0
    //   303: aload 11
    //   305: ldc_w 572
    //   308: invokevirtual 568	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   311: putfield 54	com/tencent/mm/wallet_core/c/q:tyf	I
    //   314: aload 11
    //   316: ldc_w 574
    //   319: invokevirtual 578	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   322: astore 4
    //   324: aload 4
    //   326: ifnull +332 -> 658
    //   329: aload_0
    //   330: aload 4
    //   332: invokevirtual 579	org/json/JSONObject:toString	()Ljava/lang/String;
    //   335: putfield 56	com/tencent/mm/wallet_core/c/q:tyg	Ljava/lang/String;
    //   338: aload_0
    //   339: aload 11
    //   341: ldc_w 581
    //   344: invokevirtual 568	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   347: putfield 58	com/tencent/mm/wallet_core/c/q:tyh	I
    //   350: aload 11
    //   352: ldc_w 583
    //   355: iconst_0
    //   356: invokevirtual 586	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   359: ifeq +37 -> 396
    //   362: invokestatic 592	com/tencent/mm/wallet_core/c/ab:dNZ	()Lcom/tencent/mm/wallet_core/c/ab;
    //   365: pop
    //   366: invokestatic 595	com/tencent/mm/wallet_core/c/ab:dNY	()Ljava/lang/String;
    //   369: astore 4
    //   371: ldc 72
    //   373: ldc_w 597
    //   376: iconst_1
    //   377: anewarray 240	java/lang/Object
    //   380: dup
    //   381: iconst_0
    //   382: aload 4
    //   384: aastore
    //   385: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: invokestatic 592	com/tencent/mm/wallet_core/c/ab:dNZ	()Lcom/tencent/mm/wallet_core/c/ab;
    //   391: aload 4
    //   393: invokevirtual 600	com/tencent/mm/wallet_core/c/ab:atp	(Ljava/lang/String;)V
    //   396: aload_0
    //   397: aload 11
    //   399: invokestatic 606	com/tencent/mm/wallet_core/c/k:aS	(Lorg/json/JSONObject;)Lcom/tencent/mm/wallet_core/c/k;
    //   402: putfield 425	com/tencent/mm/wallet_core/c/q:nYe	Lcom/tencent/mm/wallet_core/c/k;
    //   405: aload_0
    //   406: iconst_1
    //   407: putfield 60	com/tencent/mm/wallet_core/c/q:AfM	Z
    //   410: aload 7
    //   412: astore 4
    //   414: aload 10
    //   416: astore 7
    //   418: ldc 72
    //   420: ldc_w 608
    //   423: bipush 13
    //   425: anewarray 240	java/lang/Object
    //   428: dup
    //   429: iconst_0
    //   430: aload_0
    //   431: invokevirtual 282	com/tencent/mm/wallet_core/c/q:getType	()I
    //   434: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   437: aastore
    //   438: dup
    //   439: iconst_1
    //   440: aload_0
    //   441: invokevirtual 228	com/tencent/mm/wallet_core/c/q:cOo	()I
    //   444: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   447: aastore
    //   448: dup
    //   449: iconst_2
    //   450: iload 5
    //   452: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   455: aastore
    //   456: dup
    //   457: iconst_3
    //   458: iload 6
    //   460: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   463: aastore
    //   464: dup
    //   465: iconst_4
    //   466: aload_3
    //   467: aastore
    //   468: dup
    //   469: iconst_5
    //   470: iload 8
    //   472: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   475: aastore
    //   476: dup
    //   477: bipush 6
    //   479: aload 9
    //   481: aastore
    //   482: dup
    //   483: bipush 7
    //   485: iload_2
    //   486: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   489: aastore
    //   490: dup
    //   491: bipush 8
    //   493: aload 7
    //   495: aastore
    //   496: dup
    //   497: bipush 9
    //   499: iload_1
    //   500: invokestatic 279	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   503: aastore
    //   504: dup
    //   505: bipush 10
    //   507: aload 4
    //   509: aastore
    //   510: dup
    //   511: bipush 11
    //   513: aload 11
    //   515: aastore
    //   516: dup
    //   517: bipush 12
    //   519: aload_0
    //   520: invokevirtual 241	java/lang/Object:toString	()Ljava/lang/String;
    //   523: aastore
    //   524: invokestatic 289	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   527: new 105	com/tencent/mm/wallet_core/c/d
    //   530: dup
    //   531: iload 5
    //   533: iload 6
    //   535: aload_3
    //   536: invokespecial 611	com/tencent/mm/wallet_core/c/d:<init>	(IILjava/lang/String;)V
    //   539: astore 12
    //   541: iload 5
    //   543: ifne +317 -> 860
    //   546: iload 6
    //   548: ifne +312 -> 860
    //   551: iload 8
    //   553: ifeq +190 -> 743
    //   556: ldc 72
    //   558: ldc_w 613
    //   561: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   564: aload 12
    //   566: sipush 1000
    //   569: iload 8
    //   571: aload 9
    //   573: iconst_1
    //   574: invokevirtual 617	com/tencent/mm/wallet_core/c/d:f	(IILjava/lang/String;I)V
    //   577: iload 5
    //   579: ifne +294 -> 873
    //   582: ldc 72
    //   584: ldc_w 619
    //   587: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   590: aload 11
    //   592: ifnull +808 -> 1400
    //   595: aload 12
    //   597: getfield 622	com/tencent/mm/wallet_core/c/d:errType	I
    //   600: ifne +11 -> 611
    //   603: aload 12
    //   605: getfield 625	com/tencent/mm/wallet_core/c/d:errCode	I
    //   608: ifeq +10 -> 618
    //   611: aload_0
    //   612: invokevirtual 627	com/tencent/mm/wallet_core/c/q:cfq	()Z
    //   615: ifeq +774 -> 1389
    //   618: aload_0
    //   619: aload 12
    //   621: getfield 625	com/tencent/mm/wallet_core/c/d:errCode	I
    //   624: aload 12
    //   626: getfield 108	com/tencent/mm/wallet_core/c/d:aIm	Ljava/lang/String;
    //   629: aload 11
    //   631: invokevirtual 629	com/tencent/mm/wallet_core/c/q:a	(ILjava/lang/String;Lorg/json/JSONObject;)V
    //   634: aload_0
    //   635: aload 12
    //   637: aload 11
    //   639: invokevirtual 631	com/tencent/mm/wallet_core/c/q:a	(Lcom/tencent/mm/wallet_core/c/d;Lorg/json/JSONObject;)V
    //   642: aload_0
    //   643: getfield 48	com/tencent/mm/wallet_core/c/q:AfK	Z
    //   646: ifeq +765 -> 1411
    //   649: ldc 72
    //   651: ldc_w 633
    //   654: invokestatic 93	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   657: return
    //   658: aload_0
    //   659: ldc 40
    //   661: putfield 56	com/tencent/mm/wallet_core/c/q:tyg	Ljava/lang/String;
    //   664: goto -326 -> 338
    //   667: astore 4
    //   669: aload 7
    //   671: astore 10
    //   673: aload 4
    //   675: astore 7
    //   677: aload 10
    //   679: astore 4
    //   681: ldc 72
    //   683: new 192	java/lang/StringBuilder
    //   686: dup
    //   687: ldc_w 635
    //   690: invokespecial 224	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   693: aload 7
    //   695: invokevirtual 636	java/lang/Exception:toString	()Ljava/lang/String;
    //   698: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   704: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   707: invokestatic 116	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   710: ldc_w 637
    //   713: invokevirtual 123	android/content/Context:getString	(I)Ljava/lang/String;
    //   716: astore 7
    //   718: sipush -10089
    //   721: istore_1
    //   722: goto -304 -> 418
    //   725: ldc 72
    //   727: ldc_w 639
    //   730: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   733: aconst_null
    //   734: astore 11
    //   736: aload 10
    //   738: astore 7
    //   740: goto -322 -> 418
    //   743: iload_2
    //   744: ifeq +26 -> 770
    //   747: ldc 72
    //   749: ldc_w 641
    //   752: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   755: aload 12
    //   757: sipush 1000
    //   760: iload_2
    //   761: aload 7
    //   763: iconst_2
    //   764: invokevirtual 617	com/tencent/mm/wallet_core/c/d:f	(IILjava/lang/String;I)V
    //   767: goto -190 -> 577
    //   770: iload_1
    //   771: ifeq +55 -> 826
    //   774: ldc 72
    //   776: ldc_w 643
    //   779: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   782: iload_1
    //   783: sipush -10089
    //   786: if_icmpeq +25 -> 811
    //   789: iload_1
    //   790: sipush -10088
    //   793: if_icmpeq +18 -> 811
    //   796: aload 12
    //   798: sipush 1000
    //   801: iload_1
    //   802: aload 4
    //   804: iconst_2
    //   805: invokevirtual 617	com/tencent/mm/wallet_core/c/d:f	(IILjava/lang/String;I)V
    //   808: goto -231 -> 577
    //   811: aload 12
    //   813: sipush 1000
    //   816: iconst_2
    //   817: aload 4
    //   819: iconst_2
    //   820: invokevirtual 617	com/tencent/mm/wallet_core/c/d:f	(IILjava/lang/String;I)V
    //   823: goto -246 -> 577
    //   826: aload 7
    //   828: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   831: ifne +18 -> 849
    //   834: ldc 72
    //   836: ldc_w 645
    //   839: invokestatic 291	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   842: aload 12
    //   844: aload 7
    //   846: putfield 108	com/tencent/mm/wallet_core/c/d:aIm	Ljava/lang/String;
    //   849: ldc 72
    //   851: ldc_w 647
    //   854: invokestatic 291	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   857: goto -280 -> 577
    //   860: iload 5
    //   862: iload 6
    //   864: aload_3
    //   865: aload 12
    //   867: invokestatic 649	com/tencent/mm/wallet_core/c/q:a	(IILjava/lang/String;Lcom/tencent/mm/wallet_core/c/d;)V
    //   870: goto -293 -> 577
    //   873: invokestatic 473	com/tencent/mm/plugin/wallet_core/model/k:cPB	()Z
    //   876: ifne +37 -> 913
    //   879: ldc 72
    //   881: ldc_w 651
    //   884: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   887: goto -297 -> 590
    //   890: astore_3
    //   891: ldc 72
    //   893: ldc_w 653
    //   896: iconst_1
    //   897: anewarray 240	java/lang/Object
    //   900: dup
    //   901: iconst_0
    //   902: aload_3
    //   903: invokevirtual 656	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   906: aastore
    //   907: invokestatic 658	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   910: goto -320 -> 590
    //   913: invokestatic 437	com/tencent/mm/plugin/wallet_core/model/k:cPy	()Lcom/tencent/mm/protocal/protobuf/aw;
    //   916: astore_3
    //   917: aload_3
    //   918: ifnull -328 -> 590
    //   921: aload_3
    //   922: getfield 465	com/tencent/mm/protocal/protobuf/aw:vCI	Ljava/lang/String;
    //   925: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   928: ifne -338 -> 590
    //   931: aload_3
    //   932: getfield 478	com/tencent/mm/protocal/protobuf/aw:vCJ	Ljava/lang/String;
    //   935: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   938: ifne -348 -> 590
    //   941: aload_0
    //   942: invokevirtual 228	com/tencent/mm/wallet_core/c/q:cOo	()I
    //   945: istore_1
    //   946: aload_3
    //   947: getfield 465	com/tencent/mm/protocal/protobuf/aw:vCI	Ljava/lang/String;
    //   950: astore 13
    //   952: aload_3
    //   953: getfield 470	com/tencent/mm/protocal/protobuf/aw:vCH	Ljava/lang/String;
    //   956: astore 14
    //   958: aload_3
    //   959: getfield 478	com/tencent/mm/protocal/protobuf/aw:vCJ	Ljava/lang/String;
    //   962: astore 15
    //   964: aload 15
    //   966: invokestatic 199	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   969: ifne -379 -> 590
    //   972: aload 15
    //   974: invokevirtual 661	java/lang/String:length	()I
    //   977: istore_2
    //   978: ldc 40
    //   980: astore_3
    //   981: ldc 40
    //   983: astore 16
    //   985: ldc 40
    //   987: astore 17
    //   989: ldc 40
    //   991: astore 18
    //   993: ldc 40
    //   995: astore 19
    //   997: iload_2
    //   998: sipush 5000
    //   1001: if_icmple +115 -> 1116
    //   1004: ldc 72
    //   1006: ldc_w 663
    //   1009: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1012: aload 16
    //   1014: astore 4
    //   1016: aload 17
    //   1018: astore 7
    //   1020: aload 18
    //   1022: astore 10
    //   1024: aload 19
    //   1026: astore 9
    //   1028: ldc 72
    //   1030: ldc_w 665
    //   1033: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1036: new 667	com/tencent/mm/g/b/a/i
    //   1039: astore 19
    //   1041: aload 19
    //   1043: invokespecial 668	com/tencent/mm/g/b/a/i:<init>	()V
    //   1046: aload 19
    //   1048: iload_1
    //   1049: putfield 671	com/tencent/mm/g/b/a/i:cVl	I
    //   1052: aload 19
    //   1054: iload 5
    //   1056: putfield 674	com/tencent/mm/g/b/a/i:cVm	I
    //   1059: aload 19
    //   1061: iload 6
    //   1063: putfield 677	com/tencent/mm/g/b/a/i:cVn	I
    //   1066: aload 19
    //   1068: aload 13
    //   1070: invokevirtual 681	com/tencent/mm/g/b/a/i:ew	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1073: aload 14
    //   1075: invokevirtual 684	com/tencent/mm/g/b/a/i:ex	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1078: iload_2
    //   1079: invokestatic 686	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1082: invokevirtual 689	com/tencent/mm/g/b/a/i:ey	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1085: aload_3
    //   1086: invokevirtual 692	com/tencent/mm/g/b/a/i:ez	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1089: aload 4
    //   1091: invokevirtual 695	com/tencent/mm/g/b/a/i:eA	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1094: aload 7
    //   1096: invokevirtual 698	com/tencent/mm/g/b/a/i:eB	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1099: aload 10
    //   1101: invokevirtual 701	com/tencent/mm/g/b/a/i:eC	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1104: aload 9
    //   1106: invokevirtual 704	com/tencent/mm/g/b/a/i:eD	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/i;
    //   1109: invokevirtual 707	com/tencent/mm/g/b/a/i:ajK	()Z
    //   1112: pop
    //   1113: goto -523 -> 590
    //   1116: iload_2
    //   1117: sipush 4000
    //   1120: if_icmple +66 -> 1186
    //   1123: aload 15
    //   1125: iconst_0
    //   1126: sipush 1000
    //   1129: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1132: astore_3
    //   1133: aload 15
    //   1135: sipush 1000
    //   1138: sipush 2000
    //   1141: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1144: astore 4
    //   1146: aload 15
    //   1148: sipush 2000
    //   1151: sipush 3000
    //   1154: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1157: astore 7
    //   1159: aload 15
    //   1161: sipush 3000
    //   1164: sipush 4000
    //   1167: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1170: astore 10
    //   1172: aload 15
    //   1174: sipush 4000
    //   1177: iload_2
    //   1178: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1181: astore 9
    //   1183: goto -155 -> 1028
    //   1186: iload_2
    //   1187: sipush 3000
    //   1190: if_icmple +57 -> 1247
    //   1193: aload 15
    //   1195: iconst_0
    //   1196: sipush 1000
    //   1199: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1202: astore_3
    //   1203: aload 15
    //   1205: sipush 1000
    //   1208: sipush 2000
    //   1211: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1214: astore 4
    //   1216: aload 15
    //   1218: sipush 2000
    //   1221: sipush 3000
    //   1224: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1227: astore 7
    //   1229: aload 15
    //   1231: sipush 3000
    //   1234: iload_2
    //   1235: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1238: astore 10
    //   1240: aload 19
    //   1242: astore 9
    //   1244: goto -216 -> 1028
    //   1247: iload_2
    //   1248: sipush 2000
    //   1251: if_icmple +48 -> 1299
    //   1254: aload 15
    //   1256: iconst_0
    //   1257: sipush 1000
    //   1260: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1263: astore_3
    //   1264: aload 15
    //   1266: sipush 1000
    //   1269: sipush 2000
    //   1272: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1275: astore 4
    //   1277: aload 15
    //   1279: sipush 2000
    //   1282: iload_2
    //   1283: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1286: astore 7
    //   1288: aload 19
    //   1290: astore 9
    //   1292: aload 18
    //   1294: astore 10
    //   1296: goto -268 -> 1028
    //   1299: iload_2
    //   1300: sipush 1000
    //   1303: if_icmple +39 -> 1342
    //   1306: aload 15
    //   1308: iconst_0
    //   1309: sipush 1000
    //   1312: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1315: astore_3
    //   1316: aload 15
    //   1318: sipush 1000
    //   1321: iload_2
    //   1322: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1325: astore 4
    //   1327: aload 19
    //   1329: astore 9
    //   1331: aload 18
    //   1333: astore 10
    //   1335: aload 17
    //   1337: astore 7
    //   1339: goto -311 -> 1028
    //   1342: aload 19
    //   1344: astore 9
    //   1346: aload 18
    //   1348: astore 10
    //   1350: aload 17
    //   1352: astore 7
    //   1354: aload 16
    //   1356: astore 4
    //   1358: iload_2
    //   1359: ifle -331 -> 1028
    //   1362: aload 15
    //   1364: iconst_0
    //   1365: iload_2
    //   1366: invokevirtual 711	java/lang/String:substring	(II)Ljava/lang/String;
    //   1369: astore_3
    //   1370: aload 19
    //   1372: astore 9
    //   1374: aload 18
    //   1376: astore 10
    //   1378: aload 17
    //   1380: astore 7
    //   1382: aload 16
    //   1384: astore 4
    //   1386: goto -358 -> 1028
    //   1389: ldc 72
    //   1391: ldc_w 713
    //   1394: invokestatic 291	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1397: goto -763 -> 634
    //   1400: ldc 72
    //   1402: ldc_w 715
    //   1405: invokestatic 291	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1408: goto -774 -> 634
    //   1411: aload_0
    //   1412: getfield 717	com/tencent/mm/wallet_core/c/q:ehi	Lcom/tencent/mm/ai/f;
    //   1415: aload 12
    //   1417: getfield 622	com/tencent/mm/wallet_core/c/d:errType	I
    //   1420: aload 12
    //   1422: getfield 625	com/tencent/mm/wallet_core/c/d:errCode	I
    //   1425: aload 12
    //   1427: getfield 108	com/tencent/mm/wallet_core/c/d:aIm	Ljava/lang/String;
    //   1430: aload_0
    //   1431: invokeinterface 723 5 0
    //   1436: goto -779 -> 657
    //   1439: astore 7
    //   1441: aconst_null
    //   1442: astore 11
    //   1444: goto -763 -> 681
    //   1447: astore 7
    //   1449: goto -768 -> 681
    //
    // Exception table:
    //   from	to	target	type
    //   242	324	667	java/lang/Exception
    //   329	338	667	java/lang/Exception
    //   338	396	667	java/lang/Exception
    //   396	410	667	java/lang/Exception
    //   658	664	667	java/lang/Exception
    //   582	590	890	java/lang/Exception
    //   873	887	890	java/lang/Exception
    //   913	917	890	java/lang/Exception
    //   921	978	890	java/lang/Exception
    //   1004	1012	890	java/lang/Exception
    //   1028	1113	890	java/lang/Exception
    //   1123	1183	890	java/lang/Exception
    //   1193	1240	890	java/lang/Exception
    //   1254	1288	890	java/lang/Exception
    //   1306	1327	890	java/lang/Exception
    //   1362	1370	890	java/lang/Exception
    //   199	211	1439	java/lang/Exception
    //   211	242	1447	java/lang/Exception
  }

  public final void f(com.tencent.mm.ai.b paramb)
  {
    this.ehh = paramb;
  }

  public String getToken()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.q
 * JD-Core Version:    0.6.2
 */