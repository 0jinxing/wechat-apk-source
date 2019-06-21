package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.mars.stn.StnLogic;
import com.tencent.mars.stn.StnLogic.Task;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.protocal.h;
import com.tencent.mm.protocal.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class z
{
  final z.a[] gdP;

  public z()
  {
    AppMethodBeat.i(58645);
    this.gdP = new z.a[100];
    AppMethodBeat.o(58645);
  }

  static boolean mB(int paramInt)
  {
    if ((paramInt == 10) || (paramInt == 268369922));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  // ERROR //
  final int a(int paramInt, byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    // Byte code:
    //   0: ldc 35
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   9: astore 5
    //   11: aload 5
    //   13: monitorenter
    //   14: aload_0
    //   15: iload_1
    //   16: invokevirtual 39	com/tencent/mm/network/z:mD	(I)I
    //   19: istore 6
    //   21: iconst_m1
    //   22: iload 6
    //   24: if_icmpne +15 -> 39
    //   27: iconst_m1
    //   28: istore_1
    //   29: aload 5
    //   31: monitorexit
    //   32: ldc 35
    //   34: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: iload_1
    //   38: ireturn
    //   39: getstatic 45	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_DEFAULT	I
    //   42: istore_1
    //   43: aload_0
    //   44: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   47: iload 6
    //   49: aaload
    //   50: getfield 49	com/tencent/mm/network/z$a:gdT	Lcom/tencent/mm/network/r;
    //   53: invokeinterface 55 1 0
    //   58: invokeinterface 61 1 0
    //   63: astore 7
    //   65: aload_0
    //   66: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   69: iload 6
    //   71: aaload
    //   72: getfield 49	com/tencent/mm/network/z$a:gdT	Lcom/tencent/mm/network/r;
    //   75: invokeinterface 55 1 0
    //   80: invokeinterface 65 1 0
    //   85: lstore 8
    //   87: aload_0
    //   88: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   91: iload 6
    //   93: aaload
    //   94: getfield 49	com/tencent/mm/network/z$a:gdT	Lcom/tencent/mm/network/r;
    //   97: invokeinterface 69 1 0
    //   102: astore 10
    //   104: aload 10
    //   106: aload_0
    //   107: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   110: iload 6
    //   112: aaload
    //   113: getfield 49	com/tencent/mm/network/z$a:gdT	Lcom/tencent/mm/network/r;
    //   116: invokeinterface 73 1 0
    //   121: aload_2
    //   122: aload 7
    //   124: lload 8
    //   126: invokeinterface 78 6 0
    //   131: ifeq +264 -> 395
    //   134: aload 10
    //   136: invokeinterface 81 1 0
    //   141: istore 6
    //   143: aload 4
    //   145: iconst_0
    //   146: iconst_0
    //   147: iastore
    //   148: iload 6
    //   150: iconst_2
    //   151: iand
    //   152: ifne +25 -> 177
    //   155: aload 4
    //   157: iconst_0
    //   158: aload 4
    //   160: iconst_0
    //   161: iaload
    //   162: iconst_2
    //   163: ior
    //   164: iastore
    //   165: getstatic 87	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   168: ldc2_w 88
    //   171: lconst_0
    //   172: lconst_1
    //   173: iconst_0
    //   174: invokevirtual 92	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   177: iload 6
    //   179: iconst_4
    //   180: iand
    //   181: ifne +25 -> 206
    //   184: aload 4
    //   186: iconst_0
    //   187: aload 4
    //   189: iconst_0
    //   190: iaload
    //   191: iconst_4
    //   192: ior
    //   193: iastore
    //   194: getstatic 87	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   197: ldc2_w 88
    //   200: lconst_1
    //   201: lconst_1
    //   202: iconst_0
    //   203: invokevirtual 92	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   206: aload 10
    //   208: invokeinterface 95 1 0
    //   213: ifnull +28 -> 241
    //   216: bipush 243
    //   218: aload 10
    //   220: invokeinterface 98 1 0
    //   225: if_icmpne +16 -> 241
    //   228: invokestatic 104	com/tencent/mm/network/aa:ano	()Lcom/tencent/mm/network/t;
    //   231: ifnull +10 -> 241
    //   234: invokestatic 104	com/tencent/mm/network/aa:ano	()Lcom/tencent/mm/network/t;
    //   237: invokevirtual 110	com/tencent/mm/network/t:amS	()Z
    //   240: pop
    //   241: bipush 243
    //   243: aload 10
    //   245: invokeinterface 98 1 0
    //   250: if_icmpne +39 -> 289
    //   253: getstatic 113	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_SESSION_TIMEOUT	I
    //   256: istore 11
    //   258: iload 11
    //   260: istore_1
    //   261: iload 11
    //   263: istore 6
    //   265: aload_3
    //   266: iconst_0
    //   267: aload 10
    //   269: invokeinterface 98 1 0
    //   274: iastore
    //   275: iload 11
    //   277: istore_1
    //   278: aload 5
    //   280: monitorexit
    //   281: ldc 35
    //   283: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: goto -249 -> 37
    //   289: sipush -3002
    //   292: aload 10
    //   294: invokeinterface 98 1 0
    //   299: if_icmpeq +16 -> 315
    //   302: sipush -3003
    //   305: aload 10
    //   307: invokeinterface 98 1 0
    //   312: if_icmpne +31 -> 343
    //   315: getstatic 116	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_TASK_END	I
    //   318: istore 11
    //   320: iload 11
    //   322: istore_1
    //   323: iload 11
    //   325: istore 6
    //   327: aload_3
    //   328: iconst_0
    //   329: aload 10
    //   331: invokeinterface 98 1 0
    //   336: iastore
    //   337: iload 11
    //   339: istore_1
    //   340: goto -62 -> 278
    //   343: sipush -3001
    //   346: aload 10
    //   348: invokeinterface 98 1 0
    //   353: if_icmpne +31 -> 384
    //   356: getstatic 113	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_SESSION_TIMEOUT	I
    //   359: istore 11
    //   361: iload 11
    //   363: istore_1
    //   364: iload 11
    //   366: istore 6
    //   368: aload_3
    //   369: iconst_0
    //   370: aload 10
    //   372: invokeinterface 98 1 0
    //   377: iastore
    //   378: iload 11
    //   380: istore_1
    //   381: goto -103 -> 278
    //   384: getstatic 119	com/tencent/mars/stn/StnLogic:RESP_FAIL_HANDLE_NORMAL	I
    //   387: istore 6
    //   389: iload 6
    //   391: istore_1
    //   392: goto -114 -> 278
    //   395: getstatic 87	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   398: ldc2_w 120
    //   401: ldc2_w 122
    //   404: lconst_1
    //   405: iconst_0
    //   406: invokevirtual 92	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   409: ldc 125
    //   411: ldc 127
    //   413: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   416: goto -138 -> 278
    //   419: astore_2
    //   420: getstatic 87	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   423: ldc2_w 120
    //   426: ldc2_w 134
    //   429: lconst_1
    //   430: iconst_0
    //   431: invokevirtual 92	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   434: ldc 125
    //   436: ldc 137
    //   438: iconst_1
    //   439: anewarray 4	java/lang/Object
    //   442: dup
    //   443: iconst_0
    //   444: aload_2
    //   445: invokestatic 143	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   448: aastore
    //   449: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   452: goto -174 -> 278
    //   455: astore_2
    //   456: getstatic 87	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   459: ldc2_w 120
    //   462: ldc2_w 147
    //   465: lconst_1
    //   466: iconst_0
    //   467: invokevirtual 92	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   470: ldc 125
    //   472: ldc 137
    //   474: iconst_1
    //   475: anewarray 4	java/lang/Object
    //   478: dup
    //   479: iconst_0
    //   480: aload_2
    //   481: invokestatic 143	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   484: aastore
    //   485: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   488: goto -210 -> 278
    //   491: astore_2
    //   492: aload 5
    //   494: monitorexit
    //   495: ldc 35
    //   497: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   500: aload_2
    //   501: athrow
    //   502: astore_2
    //   503: goto -47 -> 456
    //   506: astore_2
    //   507: iload 6
    //   509: istore_1
    //   510: goto -90 -> 420
    //
    // Exception table:
    //   from	to	target	type
    //   43	143	419	android/os/RemoteException
    //   165	177	419	android/os/RemoteException
    //   194	206	419	android/os/RemoteException
    //   206	241	419	android/os/RemoteException
    //   241	258	419	android/os/RemoteException
    //   289	315	419	android/os/RemoteException
    //   315	320	419	android/os/RemoteException
    //   343	361	419	android/os/RemoteException
    //   384	389	419	android/os/RemoteException
    //   395	416	419	android/os/RemoteException
    //   43	143	455	java/lang/Exception
    //   165	177	455	java/lang/Exception
    //   194	206	455	java/lang/Exception
    //   206	241	455	java/lang/Exception
    //   241	258	455	java/lang/Exception
    //   289	315	455	java/lang/Exception
    //   315	320	455	java/lang/Exception
    //   343	361	455	java/lang/Exception
    //   384	389	455	java/lang/Exception
    //   395	416	455	java/lang/Exception
    //   14	21	491	finally
    //   29	32	491	finally
    //   39	43	491	finally
    //   43	143	491	finally
    //   165	177	491	finally
    //   194	206	491	finally
    //   206	241	491	finally
    //   241	258	491	finally
    //   265	275	491	finally
    //   278	281	491	finally
    //   289	315	491	finally
    //   315	320	491	finally
    //   327	337	491	finally
    //   343	361	491	finally
    //   368	378	491	finally
    //   384	389	491	finally
    //   395	416	491	finally
    //   420	452	491	finally
    //   456	488	491	finally
    //   492	495	491	finally
    //   265	275	502	java/lang/Exception
    //   327	337	502	java/lang/Exception
    //   368	378	502	java/lang/Exception
    //   265	275	506	android/os/RemoteException
    //   327	337	506	android/os/RemoteException
    //   368	378	506	android/os/RemoteException
  }

  public final int a(r paramr, l paraml, c paramc, int paramInt)
  {
    AppMethodBeat.i(58651);
    if (paramr == null)
    {
      ab.e("MicroMsg.MMNativeNetTaskAdapter", "startTask  rr is null");
      i = -1;
      AppMethodBeat.o(58651);
      return i;
    }
    paramr.hashCode();
    StnLogic.Task localTask = new StnLogic.Task();
    z.a[] arrayOfa1 = this.gdP;
    int i = 0;
    label53: if (i < 100);
    while (true)
    {
      try
      {
        if (this.gdP[i] == null)
        {
          z.a[] arrayOfa2 = this.gdP;
          z.a locala = new com/tencent/mm/network/z$a;
          locala.<init>((byte)0);
          arrayOfa2[i] = locala;
          this.gdP[i].gdT = paramr;
          this.gdP[i].gdU = paraml;
          this.gdP[i].gdV = paramc;
          this.gdP[i].startTime = bo.anU();
          this.gdP[i].taskId = localTask.taskID;
          localTask.cmdID = paramr.adt().getCmdId();
          localTask.cgi = paramr.getUri();
          int j = paramr.getType();
          if ((paramr.acC() & 0x1) != 1)
          {
            bool = true;
            localTask.needAuthed = bool;
            if ((j == 126) || (j == 252) || (j == 701) || (j == 702) || (j == 763))
            {
              localTask.needAuthed = false;
              if ((j == 701) || (j == 252))
                localTask.retryCount = 1;
            }
            localTask.limitFlow = true;
            if ((j == 149) || (j == 193) || (j == 220) || (j == 323) || (j == 324) || (j == 326) || (j == 327) || (j == 703))
              localTask.limitFlow = false;
            if (j == 703)
              localTask.limitFrequency = false;
            localTask.channelStrategy = 0;
            if ((j == 233) || (j == 835) || (j == 238))
              localTask.channelStrategy = 1;
            localTask.sendOnly = false;
            if (mB(j))
              localTask.sendOnly = true;
            if ((paramr.adt().adr()) && (paramr.getUri() != null) && (paramr.getUri().length() > 0))
              localTask.channelSelect |= 1;
            if (localTask.cmdID != 0)
              localTask.channelSelect |= 2;
            localTask.reportArg = String.valueOf(j);
            if (j == 522)
            {
              localTask.totalTimeout = 300000;
              localTask.priority = 0;
            }
            if (j == 710)
            {
              localTask.totalTimeout = 15000;
              localTask.serverProcessCost = 0;
            }
            if (j == 2632)
            {
              j = paramr.acB();
              if (j != 0)
                localTask.totalTimeout = j;
            }
            ab.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi startTask inQueue netid:%d hash[%d,%d] net:%d cgi:%s needAuthed:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(localTask.taskID), Integer.valueOf(paramr.acO()), Integer.valueOf(localTask.channelSelect), localTask.cgi, Boolean.valueOf(localTask.needAuthed) });
            if (-1 == i)
              break label740;
            if (paramInt == 1)
              localTask.retryCount = 0;
            StnLogic.startTask(localTask);
            ab.d("MicroMsg.MMNativeNetTaskAdapter", "startTask retsult=".concat(String.valueOf(i)));
            AppMethodBeat.o(58651);
            break;
          }
          boolean bool = false;
          continue;
        }
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bo.l(localRemoteException) });
        i++;
        break label53;
      }
      finally
      {
        AppMethodBeat.o(58651);
      }
      label740: ab.e("MicroMsg.MMNativeNetTaskAdapter", "startTask err");
      continue;
      i = -1;
    }
  }

  final boolean a(int paramInt1, ByteArrayOutputStream paramByteArrayOutputStream, int[] paramArrayOfInt, int paramInt2)
  {
    AppMethodBeat.i(58655);
    synchronized (this.gdP)
    {
      int i = mD(paramInt1);
      boolean bool;
      if (-1 == i)
      {
        bool = false;
        AppMethodBeat.o(58655);
      }
      while (true)
      {
        return bool;
        try
        {
          ab.i("MicroMsg.MMNativeNetTaskAdapter", "link: %d req2Buf somr isfg:%b  cookie: %s, type: %d", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(this.gdP[i].gdV.ade()), bo.cd(this.gdP[i].gdV.ada()), Integer.valueOf(this.gdP[i].gdT.getType()) });
          paramInt1 = 1;
          if (!this.gdP[i].gdT.acH())
          {
            paramInt1 = 2;
            this.gdP[i].gdT.adt().U(this.gdP[i].gdV.jQ(3));
            ab.i("MicroMsg.MMNativeNetTaskAdapter", "summerauths isSingleSession false type:[%s]", new Object[] { Integer.valueOf(this.gdP[i].gdT.getType()) });
          }
          this.gdP[i].gdT.adt().T(this.gdP[i].gdV.jQ(paramInt1));
          this.gdP[i].gdT.adt().hB(this.gdP[i].gdV.QF());
          h localh = this.gdP[i].gdT.adt();
          paramInt2 = this.gdP[i].gdT.getType();
          byte[] arrayOfByte = this.gdP[i].gdV.jQ(paramInt1);
          if (paramInt1 == 2)
          {
            paramInt1 = 13;
            label348: bool = localh.a(paramInt2, arrayOfByte, paramInt1, this.gdP[i].gdV.ada(), this.gdP[i].gdV.adc(), 0, this.gdP[i].gdV.ade());
            if (!bool)
              break label474;
            paramByteArrayOutputStream.write(this.gdP[i].gdT.adt().adk());
          }
          while (true)
          {
            ab.d("MicroMsg.MMNativeNetTaskAdapter", "req2Buf bOk: %b", new Object[] { Boolean.valueOf(bool) });
            AppMethodBeat.o(58655);
            break;
            paramInt1 = 0;
            break label348;
            label474: paramArrayOfInt[0] = 0;
            e.pXa.a(162L, paramArrayOfInt[0], 1L, false);
            ab.e("MicroMsg.MMNativeNetTaskAdapter", "request to buffer using jni failed");
          }
        }
        catch (RemoteException paramByteArrayOutputStream)
        {
          while (true)
          {
            paramArrayOfInt[0] = 1;
            e.pXa.a(162L, paramArrayOfInt[0], 1L, false);
            ab.e("MicroMsg.MMNativeNetTaskAdapter", "RemoteException:%s", new Object[] { bo.l(paramByteArrayOutputStream) });
            bool = false;
          }
        }
        catch (IOException paramByteArrayOutputStream)
        {
          while (true)
          {
            paramArrayOfInt[0] = 2;
            e.pXa.a(162L, paramArrayOfInt[0], 1L, false);
            ab.e("MicroMsg.MMNativeNetTaskAdapter", "IOException:%s", new Object[] { bo.l(paramByteArrayOutputStream) });
            bool = false;
          }
        }
        catch (Exception paramByteArrayOutputStream)
        {
          while (true)
          {
            paramArrayOfInt[0] = 3;
            e.pXa.a(162L, paramArrayOfInt[0], 1L, false);
            ab.e("MicroMsg.MMNativeNetTaskAdapter", "Exception:%s", new Object[] { bo.l(paramByteArrayOutputStream) });
            bool = false;
          }
        }
      }
    }
  }

  final boolean anc()
  {
    boolean bool = true;
    AppMethodBeat.i(58647);
    z.a[] arrayOfa = this.gdP;
    int i = 0;
    while (true)
    {
      if (i < 100);
      try
      {
        if ((this.gdP[i] != null) && ((252 == this.gdP[i].gdT.getType()) || (701 == this.gdP[i].gdT.getType()) || (702 == this.gdP[i].gdT.getType()) || (763 == this.gdP[i].gdT.getType())))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("hasAuthCmd Auth inQueue: netid=");
          ab.w("MicroMsg.MMNativeNetTaskAdapter", i + " type=" + this.gdP[i].gdT.getType());
          return bool;
        }
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          this.gdP[i] = null;
          ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", new Object[] { bo.l(localRemoteException), Integer.valueOf(i) });
          i++;
          break;
          AppMethodBeat.o(58647);
          bool = false;
        }
      }
      finally
      {
        AppMethodBeat.o(58647);
      }
    }
  }

  final boolean and()
  {
    boolean bool = true;
    AppMethodBeat.i(58648);
    z.a[] arrayOfa = this.gdP;
    int i = 0;
    while (true)
    {
      if (i < 100);
      try
      {
        if ((this.gdP[i] != null) && (1000 == this.gdP[i].gdT.getType()))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("hasWithoutLoginCmd inQueue: netid=");
          ab.w("MicroMsg.MMNativeNetTaskAdapter", i + " type=" + this.gdP[i].gdT.getType());
          return bool;
        }
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          this.gdP[i] = null;
          ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", new Object[] { bo.l(localRemoteException), Integer.valueOf(i) });
          i++;
          break;
          AppMethodBeat.o(58648);
          bool = false;
        }
      }
      finally
      {
        AppMethodBeat.o(58648);
      }
    }
  }

  public final int ane()
  {
    AppMethodBeat.i(58650);
    int i = 0;
    int j = 0;
    while (true)
      if (i < 100)
      {
        int k = j;
        try
        {
          if (this.gdP[i] != null)
          {
            this.gdP[i].gdT.getType();
            k = j;
          }
          i++;
          j = k;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
          {
            ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", new Object[] { bo.l(localRemoteException), Integer.valueOf(i) });
            k = j + 1;
            this.gdP[i] = null;
          }
        }
      }
    AppMethodBeat.o(58650);
    return j;
  }

  final r de(boolean paramBoolean)
  {
    AppMethodBeat.i(58649);
    z.a[] arrayOfa = this.gdP;
    int i = 0;
    Object localObject1 = null;
    if (i < 100);
    while (true)
    {
      try
      {
        while (true)
        {
          z.a locala = this.gdP[i];
          Object localObject3 = localObject1;
          if (locala != null)
            if (paramBoolean)
              localObject3 = localObject1;
          try
          {
            if (!(this.gdP[i].gdT instanceof r.a))
            {
              if ((!paramBoolean) && (!(this.gdP[i].gdT instanceof r.a)))
                localObject3 = localObject1;
            }
            else
            {
              i++;
              localObject1 = localObject3;
              break;
            }
            if ((252 == this.gdP[i].gdT.getType()) || (701 == this.gdP[i].gdT.getType()) || (763 == this.gdP[i].gdT.getType()) || (702 == this.gdP[i].gdT.getType()))
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("getAutoAuthRR Auth inQueue: netid=");
              ab.e("MicroMsg.MMNativeNetTaskAdapter", i + " type=" + this.gdP[i].gdT.getType());
              AppMethodBeat.o(58649);
              localObject1 = null;
              return localObject1;
            }
          }
          catch (RemoteException localRemoteException)
          {
            while (true)
            {
              ab.w("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bo.l(localRemoteException) });
              localObject4 = localObject1;
            }
          }
        }
      }
      finally
      {
        AppMethodBeat.o(58649);
      }
      Object localObject4 = localObject2;
      if (localObject2 == null)
      {
        localObject4 = this.gdP[i].gdT;
        continue;
        AppMethodBeat.o(58649);
      }
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(58646);
    reset();
    super.finalize();
    AppMethodBeat.o(58646);
  }

  // ERROR //
  public final void i(int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: ldc_w 397
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 125
    //   8: new 351	java/lang/StringBuilder
    //   11: dup
    //   12: ldc_w 399
    //   15: invokespecial 356	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   18: iload_1
    //   19: invokevirtual 360	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   22: ldc_w 401
    //   25: invokevirtual 365	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: iload_2
    //   29: invokevirtual 360	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   32: ldc_w 403
    //   35: invokevirtual 365	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_3
    //   39: invokevirtual 365	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 368	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokestatic 405	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: invokestatic 408	com/tencent/mars/stn/StnLogic:clearTask	()V
    //   51: invokestatic 409	com/tencent/mars/stn/StnLogic:reset	()V
    //   54: bipush 100
    //   56: anewarray 6	com/tencent/mm/network/z$a
    //   59: astore 4
    //   61: aload_0
    //   62: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   65: astore 5
    //   67: aload 5
    //   69: monitorenter
    //   70: iconst_0
    //   71: istore 6
    //   73: iload 6
    //   75: bipush 100
    //   77: if_icmpge +29 -> 106
    //   80: aload 4
    //   82: iload 6
    //   84: aload_0
    //   85: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   88: iload 6
    //   90: aaload
    //   91: aastore
    //   92: aload_0
    //   93: getfield 21	com/tencent/mm/network/z:gdP	[Lcom/tencent/mm/network/z$a;
    //   96: iload 6
    //   98: aconst_null
    //   99: aastore
    //   100: iinc 6 1
    //   103: goto -30 -> 73
    //   106: aload 5
    //   108: monitorexit
    //   109: iconst_0
    //   110: istore 6
    //   112: iload 6
    //   114: bipush 100
    //   116: if_icmpge +138 -> 254
    //   119: aload 4
    //   121: iload 6
    //   123: aaload
    //   124: ifnull +88 -> 212
    //   127: ldc 125
    //   129: ldc_w 411
    //   132: iconst_3
    //   133: anewarray 4	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: iload 6
    //   140: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   143: aastore
    //   144: dup
    //   145: iconst_1
    //   146: aload 4
    //   148: iload 6
    //   150: aaload
    //   151: getfield 49	com/tencent/mm/network/z$a:gdT	Lcom/tencent/mm/network/r;
    //   154: invokeinterface 73 1 0
    //   159: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   162: aastore
    //   163: dup
    //   164: iconst_2
    //   165: aload 4
    //   167: iload 6
    //   169: aaload
    //   170: getfield 49	com/tencent/mm/network/z$a:gdT	Lcom/tencent/mm/network/r;
    //   173: invokeinterface 261 1 0
    //   178: invokestatic 258	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   181: aastore
    //   182: invokestatic 268	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: aload 4
    //   187: iload 6
    //   189: aaload
    //   190: getfield 165	com/tencent/mm/network/z$a:gdU	Lcom/tencent/mm/network/l;
    //   193: iload 6
    //   195: iload_1
    //   196: iload_2
    //   197: aload_3
    //   198: aload 4
    //   200: iload 6
    //   202: aaload
    //   203: getfield 49	com/tencent/mm/network/z$a:gdT	Lcom/tencent/mm/network/r;
    //   206: aconst_null
    //   207: invokeinterface 416 7 0
    //   212: iinc 6 1
    //   215: goto -103 -> 112
    //   218: astore_3
    //   219: aload 5
    //   221: monitorexit
    //   222: ldc_w 397
    //   225: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_3
    //   229: athrow
    //   230: astore 5
    //   232: ldc 125
    //   234: ldc 137
    //   236: iconst_1
    //   237: anewarray 4	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: aload 5
    //   244: invokestatic 143	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   247: aastore
    //   248: invokestatic 146	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: goto -39 -> 212
    //   254: ldc_w 397
    //   257: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   260: return
    //
    // Exception table:
    //   from	to	target	type
    //   80	100	218	finally
    //   106	109	218	finally
    //   219	222	218	finally
    //   127	212	230	java/lang/Exception
  }

  final int mC(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(58654);
    synchronized (this.gdP)
    {
      paramInt = mD(paramInt);
      if (-1 == paramInt)
      {
        ab.e("MicroMsg.MMNativeNetTaskAdapter", "-1 == index");
        AppMethodBeat.o(58654);
        paramInt = i;
      }
      while (true)
      {
        return paramInt;
        try
        {
          paramInt = this.gdP[paramInt].gdT.adu().ady();
          AppMethodBeat.o(58654);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bo.l(localException) });
          AppMethodBeat.o(58654);
          paramInt = i;
        }
      }
    }
  }

  final int mD(int paramInt)
  {
    for (int i = 0; (i < 100) && ((this.gdP[i] == null) || (paramInt != this.gdP[i].taskId)); i++);
    paramInt = i;
    if (100 <= i)
      paramInt = -1;
    return paramInt;
  }

  public final void reset()
  {
    AppMethodBeat.i(58652);
    ab.i("MicroMsg.MMNativeNetTaskAdapter", "reset");
    StnLogic.reset();
    z.a[] arrayOfa = this.gdP;
    int i = 0;
    while (i < 100)
      try
      {
        z.a locala = this.gdP[i];
        if (locala != null);
        try
        {
          ab.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi reset outQueue: netId:%d hash:%d type:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.gdP[i].gdT.getType()), Integer.valueOf(this.gdP[i].gdT.acO()) });
          this.gdP[i] = null;
          i++;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
            ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", new Object[] { bo.l(localRemoteException) });
        }
      }
      finally
      {
        AppMethodBeat.o(58652);
      }
    AppMethodBeat.o(58652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.z
 * JD-Core Version:    0.6.2
 */