package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.vfs.e;

public class f
{
  public static f kTO;
  public boolean isRunning = false;
  private String key;

  public static f bjK()
  {
    AppMethodBeat.i(52865);
    if (kTO == null);
    try
    {
      f localf = new com/tencent/mm/plugin/emoji/e/f;
      localf.<init>();
      kTO = localf;
      localf = kTO;
      AppMethodBeat.o(52865);
      return localf;
    }
    finally
    {
      AppMethodBeat.o(52865);
    }
  }

  private String bjL()
  {
    AppMethodBeat.i(52866);
    if (bo.isNullOrNil(this.key))
      this.key = j.getEmojiStorageMgr().xYn.getKey();
    String str = this.key;
    AppMethodBeat.o(52866);
    return str;
  }

  public final boolean c(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(52868);
    if (paramEmojiInfo == null)
    {
      ab.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. emoji is null.");
      paramBoolean = false;
      AppMethodBeat.o(52868);
    }
    while (true)
    {
      return paramBoolean;
      if (isEnable())
        break;
      ab.i("MicroMsg.emoji.EmojiFileEncryptMgr", "disable encrypt");
      paramBoolean = false;
      AppMethodBeat.o(52868);
    }
    String str = paramEmojiInfo.dve();
    Object localObject;
    boolean bool2;
    if (e.ct(str))
    {
      boolean bool1 = false;
      localObject = e.e(str, 0, 10);
      bool2 = bool1;
      if (localObject != null)
        bool2 = bool1;
    }
    while (true)
    {
      try
      {
        if (localObject.length >= 10)
          bool2 = r.bT((byte[])localObject);
        if ((!paramBoolean) && (!bool2))
          break label410;
        l = System.currentTimeMillis();
        i = (int)e.asZ(str);
        if (i > 1024)
        {
          j = 1024;
          arrayOfByte1 = e.e(str, 0, i);
          arrayOfByte2 = e.e(str, 0, j);
          localObject = new byte[0];
        }
      }
      catch (Throwable localThrowable1)
      {
        try
        {
          long l;
          int i;
          byte[] arrayOfByte1;
          byte[] arrayOfByte2 = AesEcb.aesCryptEcb(arrayOfByte2, bjL().getBytes(), true, false);
          localObject = arrayOfByte2;
          if ((localObject == null) || (localObject.length < j) || (arrayOfByte1 == null) || (arrayOfByte1.length < j))
            break label468;
          System.arraycopy(localObject, 0, arrayOfByte1, 0, j);
          j = e.b(str, arrayOfByte1, arrayOfByte1.length);
          if (j == 0)
          {
            l = System.currentTimeMillis() - l;
            h.pYm.a(252L, 1L, l, false);
            h.pYm.a(252L, 6L, 1L, false);
            paramEmojiInfo.field_reserved4 |= EmojiInfo.yaB;
            paramEmojiInfo.field_size = i;
            j.getEmojiStorageMgr().xYn.H(paramEmojiInfo);
            ab.i("MicroMsg.emoji.EmojiFileEncryptMgr", "encode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte1.length), Long.valueOf(l) });
            paramBoolean = true;
            AppMethodBeat.o(52868);
            break;
            localThrowable1 = localThrowable1;
            ab.printErrStackTrace("MicroMsg.emoji.EmojiFileEncryptMgr", localThrowable1, "", new Object[0]);
            bool2 = false;
            continue;
            j = i;
          }
        }
        catch (Throwable localThrowable2)
        {
          ab.printErrStackTrace("MicroMsg.emoji.EmojiFileEncryptMgr", localThrowable2, "", new Object[0]);
          continue;
          ab.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. write file failed.");
          h.pYm.a(252L, 3L, 1L, false);
          paramBoolean = false;
          AppMethodBeat.o(52868);
        }
      }
      break;
      label410: ab.i("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile file had encrypt.");
      paramBoolean = true;
      AppMethodBeat.o(52868);
      break;
      ab.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. file not exist. path%s", new Object[] { str });
      paramEmojiInfo.field_reserved4 = 0;
      j.getEmojiStorageMgr().xYn.H(paramEmojiInfo);
      paramBoolean = false;
      AppMethodBeat.o(52868);
      break;
      label468: int j = -1;
    }
  }

  public final boolean isEnable()
  {
    AppMethodBeat.i(52867);
    boolean bool;
    if (bo.isNullOrNil(bjL()))
    {
      bool = false;
      AppMethodBeat.o(52867);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(52867);
    }
  }

  public final byte[] l(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(52869);
    if (paramEmojiInfo == null)
    {
      ab.w("MicroMsg.emoji.EmojiFileEncryptMgr", "decodeEmojiData failed. emoji is null.");
      paramEmojiInfo = null;
      AppMethodBeat.o(52869);
    }
    while (true)
    {
      return paramEmojiInfo;
      String str = paramEmojiInfo.dve();
      byte[] arrayOfByte1 = e.e(str, 0, -1);
      if ((e.asZ(str) > 0L) && (arrayOfByte1 != null) && (arrayOfByte1.length >= 10))
      {
        byte[] arrayOfByte2 = new byte[10];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 10);
        if (((paramEmojiInfo.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB) && (!r.bT(arrayOfByte2)))
        {
          long l = System.currentTimeMillis();
          int i = (int)e.asZ(str);
          int j = i;
          if (i > 1024)
            j = 1024;
          byte[] arrayOfByte3 = e.e(str, 0, j);
          arrayOfByte2 = null;
          paramEmojiInfo = arrayOfByte2;
          if (!bo.isNullOrNil(bjL()));
          try
          {
            paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte3, bjL().getBytes(), false, false);
            if ((!bo.cb(paramEmojiInfo)) && (!bo.cb(arrayOfByte1)))
            {
              System.arraycopy(paramEmojiInfo, 0, arrayOfByte1, 0, j);
              l = System.currentTimeMillis() - l;
              h.pYm.a(252L, 0L, l, false);
              h.pYm.a(252L, 5L, 1L, false);
              ab.d("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte1.length), Long.valueOf(l) });
              AppMethodBeat.o(52869);
              paramEmojiInfo = arrayOfByte1;
            }
          }
          catch (Throwable paramEmojiInfo)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.emoji.EmojiFileEncryptMgr", paramEmojiInfo, "", new Object[0]);
              paramEmojiInfo = arrayOfByte2;
            }
            h.pYm.a(252L, 2L, 1L, false);
            ab.i("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path:%s return original ", new Object[] { str });
            AppMethodBeat.o(52869);
            paramEmojiInfo = arrayOfByte1;
          }
        }
        else
        {
          AppMethodBeat.o(52869);
          paramEmojiInfo = arrayOfByte1;
        }
      }
      else
      {
        ab.i("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path is no exist :%s ", new Object[] { str });
        paramEmojiInfo = null;
        AppMethodBeat.o(52869);
      }
    }
  }

  public final boolean m(EmojiInfo paramEmojiInfo)
  {
    int i = 1024;
    boolean bool = false;
    AppMethodBeat.i(52870);
    if (paramEmojiInfo == null)
    {
      ab.w("MicroMsg.emoji.EmojiFileEncryptMgr", "decodeEmojiData failed. emoji is null.");
      AppMethodBeat.o(52870);
      return bool;
    }
    long l = System.currentTimeMillis();
    Object localObject = paramEmojiInfo.dve();
    int j = (int)e.asZ((String)localObject);
    label59: byte[] arrayOfByte;
    if (j > 1024)
    {
      j = i;
      arrayOfByte = e.e((String)localObject, 0, j);
      if ((e.asZ((String)localObject) <= 0L) || (arrayOfByte == null) || (arrayOfByte.length < 10))
        break label243;
      localObject = new byte[10];
      System.arraycopy(arrayOfByte, 0, localObject, 0, 10);
      if (!r.bT((byte[])localObject))
        break label160;
    }
    label160: label243: for (bool = true; ; bool = false)
      while (true)
      {
        ab.d("MicroMsg.emoji.EmojiFileEncryptMgr", "checkout use time:%s result:%b", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool) });
        AppMethodBeat.o(52870);
        break;
        break label59;
        if ((paramEmojiInfo.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB)
        {
          localObject = null;
          paramEmojiInfo = (EmojiInfo)localObject;
          if (!bo.isNullOrNil(bjL()));
          try
          {
            paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte, bjL().getBytes(), false, false);
            if ((!bo.cb(paramEmojiInfo)) && (r.bT(paramEmojiInfo)))
              bool = true;
          }
          catch (Throwable paramEmojiInfo)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.emoji.EmojiFileEncryptMgr", paramEmojiInfo, "", new Object[0]);
              paramEmojiInfo = (EmojiInfo)localObject;
            }
          }
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.f
 * JD-Core Version:    0.6.2
 */