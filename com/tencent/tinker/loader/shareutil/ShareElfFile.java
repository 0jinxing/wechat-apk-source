package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class ShareElfFile
  implements Closeable
{
  private final FileInputStream ADV;
  private final Map<String, SectionHeader> ADW = new HashMap();
  public ElfHeader ADX = null;
  public ProgramHeader[] ADY = null;
  public SectionHeader[] ADZ = null;

  public ShareElfFile(File paramFile)
  {
    this.ADV = new FileInputStream(paramFile);
    Object localObject1 = this.ADV.getChannel();
    this.ADX = new ElfHeader((FileChannel)localObject1, (byte)0);
    Object localObject2 = ByteBuffer.allocate(128);
    ((ByteBuffer)localObject2).limit(this.ADX.AEj);
    if (this.ADX.AEa[5] == 1);
    for (paramFile = ByteOrder.LITTLE_ENDIAN; ; paramFile = ByteOrder.BIG_ENDIAN)
    {
      ((ByteBuffer)localObject2).order(paramFile);
      ((FileChannel)localObject1).position(this.ADX.AEf);
      this.ADY = new ProgramHeader[this.ADX.AEk];
      for (j = 0; j < this.ADY.length; j++)
      {
        a((FileChannel)localObject1, (ByteBuffer)localObject2, "failed to read phdr.");
        this.ADY[j] = new ProgramHeader((ByteBuffer)localObject2, this.ADX.AEa[4], 0);
      }
    }
    ((FileChannel)localObject1).position(this.ADX.AEg);
    ((ByteBuffer)localObject2).limit(this.ADX.AEl);
    this.ADZ = new SectionHeader[this.ADX.AEm];
    for (int j = 0; j < this.ADZ.length; j++)
    {
      a((FileChannel)localObject1, (ByteBuffer)localObject2, "failed to read shdr.");
      this.ADZ[j] = new SectionHeader((ByteBuffer)localObject2, this.ADX.AEa[4], 0);
    }
    if (this.ADX.AEn > 0)
    {
      localObject2 = this.ADZ[this.ADX.AEn];
      paramFile = ByteBuffer.allocate((int)((SectionHeader)localObject2).AEB);
      this.ADV.getChannel().position(((SectionHeader)localObject2).AEA);
      a(this.ADV.getChannel(), paramFile, "failed to read section: " + ((SectionHeader)localObject2).AEG);
      localObject1 = this.ADZ;
      int k = localObject1.length;
      for (j = i; j < k; j++)
      {
        localObject2 = localObject1[j];
        paramFile.position(((SectionHeader)localObject2).AEw);
        ((SectionHeader)localObject2).AEG = K(paramFile);
        this.ADW.put(((SectionHeader)localObject2).AEG, localObject2);
      }
    }
  }

  private static String K(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = paramByteBuffer.array();
    int i = paramByteBuffer.position();
    while ((paramByteBuffer.hasRemaining()) && (arrayOfByte[paramByteBuffer.position()] != 0))
      paramByteBuffer.position(paramByteBuffer.position() + 1);
    paramByteBuffer.position(paramByteBuffer.position() + 1);
    return new String(arrayOfByte, i, paramByteBuffer.position() - i - 1, Charset.forName("ASCII"));
  }

  public static void a(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, String paramString)
  {
    paramByteBuffer.rewind();
    int i = paramFileChannel.read(paramByteBuffer);
    if (i != paramByteBuffer.limit())
      throw new IOException(paramString + " Rest bytes insufficient, expect to read " + paramByteBuffer.limit() + " bytes but only " + i + " bytes were read.");
    paramByteBuffer.flip();
  }

  // ERROR //
  public static int an(File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_4
    //   3: newarray byte
    //   5: astore_2
    //   6: new 46	java/io/FileInputStream
    //   9: astore_3
    //   10: aload_3
    //   11: aload_0
    //   12: invokespecial 48	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: aload_3
    //   16: aload_2
    //   17: invokevirtual 228	java/io/InputStream:read	([B)I
    //   20: pop
    //   21: aload_2
    //   22: iconst_0
    //   23: baload
    //   24: bipush 100
    //   26: if_icmpne +37 -> 63
    //   29: aload_2
    //   30: iconst_1
    //   31: baload
    //   32: bipush 101
    //   34: if_icmpne +29 -> 63
    //   37: aload_2
    //   38: iconst_2
    //   39: baload
    //   40: bipush 121
    //   42: if_icmpne +21 -> 63
    //   45: aload_2
    //   46: iconst_3
    //   47: baload
    //   48: istore 4
    //   50: iload 4
    //   52: bipush 10
    //   54: if_icmpne +9 -> 63
    //   57: aload_3
    //   58: invokevirtual 231	java/io/InputStream:close	()V
    //   61: iload_1
    //   62: ireturn
    //   63: aload_2
    //   64: iconst_0
    //   65: baload
    //   66: bipush 127
    //   68: if_icmpne +38 -> 106
    //   71: aload_2
    //   72: iconst_1
    //   73: baload
    //   74: bipush 69
    //   76: if_icmpne +30 -> 106
    //   79: aload_2
    //   80: iconst_2
    //   81: baload
    //   82: bipush 76
    //   84: if_icmpne +22 -> 106
    //   87: aload_2
    //   88: iconst_3
    //   89: baload
    //   90: istore_1
    //   91: iload_1
    //   92: bipush 70
    //   94: if_icmpne +12 -> 106
    //   97: aload_3
    //   98: invokevirtual 231	java/io/InputStream:close	()V
    //   101: iconst_1
    //   102: istore_1
    //   103: goto -42 -> 61
    //   106: aload_3
    //   107: invokevirtual 231	java/io/InputStream:close	()V
    //   110: iconst_m1
    //   111: istore_1
    //   112: goto -51 -> 61
    //   115: astore_0
    //   116: aconst_null
    //   117: astore_3
    //   118: aload_3
    //   119: ifnull +7 -> 126
    //   122: aload_3
    //   123: invokevirtual 231	java/io/InputStream:close	()V
    //   126: aload_0
    //   127: athrow
    //   128: astore_0
    //   129: goto -68 -> 61
    //   132: astore_0
    //   133: goto -32 -> 101
    //   136: astore_0
    //   137: goto -27 -> 110
    //   140: astore_3
    //   141: goto -15 -> 126
    //   144: astore_0
    //   145: goto -27 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   2	15	115	finally
    //   57	61	128	java/lang/Throwable
    //   97	101	132	java/lang/Throwable
    //   106	110	136	java/lang/Throwable
    //   122	126	140	java/lang/Throwable
    //   15	21	144	finally
  }

  public void close()
  {
    this.ADV.close();
    this.ADW.clear();
    this.ADY = null;
    this.ADZ = null;
  }

  public static class ElfHeader
  {
    public final byte[] AEa = new byte[16];
    public final short AEb;
    public final short AEc;
    public final int AEd;
    public final long AEe;
    public final long AEf;
    public final long AEg;
    public final int AEh;
    public final short AEi;
    public final short AEj;
    public final short AEk;
    public final short AEl;
    public final short AEm;
    public final short AEn;

    private ElfHeader(FileChannel paramFileChannel)
    {
      paramFileChannel.position(0L);
      paramFileChannel.read(ByteBuffer.wrap(this.AEa));
      if ((this.AEa[0] != 127) || (this.AEa[1] != 69) || (this.AEa[2] != 76) || (this.AEa[3] != 70))
        throw new IOException(String.format("bad elf magic: %x %x %x %x.", new Object[] { Byte.valueOf(this.AEa[0]), Byte.valueOf(this.AEa[1]), Byte.valueOf(this.AEa[2]), Byte.valueOf(this.AEa[3]) }));
      ShareElfFile.D(this.AEa[4], 2, "bad elf class: " + this.AEa[4]);
      ShareElfFile.D(this.AEa[5], 2, "bad elf data encoding: " + this.AEa[5]);
      int i;
      label214: ByteBuffer localByteBuffer;
      if (this.AEa[4] == 1)
      {
        i = 36;
        localByteBuffer = ByteBuffer.allocate(i);
        if (this.AEa[5] != 1)
          break label363;
      }
      label363: for (ByteOrder localByteOrder = ByteOrder.LITTLE_ENDIAN; ; localByteOrder = ByteOrder.BIG_ENDIAN)
      {
        localByteBuffer.order(localByteOrder);
        ShareElfFile.a(paramFileChannel, localByteBuffer, "failed to read rest part of ehdr.");
        this.AEb = localByteBuffer.getShort();
        this.AEc = localByteBuffer.getShort();
        this.AEd = localByteBuffer.getInt();
        ShareElfFile.D(this.AEd, 1, "bad elf version: " + this.AEd);
        switch (this.AEa[4])
        {
        default:
          throw new IOException("Unexpected elf class: " + this.AEa[4]);
          i = 48;
          break label214;
        case 1:
        case 2:
        }
      }
      this.AEe = localByteBuffer.getInt();
      this.AEf = localByteBuffer.getInt();
      for (this.AEg = localByteBuffer.getInt(); ; this.AEg = localByteBuffer.getLong())
      {
        this.AEh = localByteBuffer.getInt();
        this.AEi = localByteBuffer.getShort();
        this.AEj = localByteBuffer.getShort();
        this.AEk = localByteBuffer.getShort();
        this.AEl = localByteBuffer.getShort();
        this.AEm = localByteBuffer.getShort();
        this.AEn = localByteBuffer.getShort();
        return;
        this.AEe = localByteBuffer.getLong();
        this.AEf = localByteBuffer.getLong();
      }
    }
  }

  public static class ProgramHeader
  {
    public final int AEo;
    public final int AEp;
    public final long AEq;
    public final long AEr;
    public final long AEs;
    public final long AEt;
    public final long AEu;
    public final long AEv;

    private ProgramHeader(ByteBuffer paramByteBuffer, int paramInt)
    {
      switch (paramInt)
      {
      default:
        throw new IOException("Unexpected elf class: ".concat(String.valueOf(paramInt)));
      case 1:
        this.AEo = paramByteBuffer.getInt();
        this.AEq = paramByteBuffer.getInt();
        this.AEr = paramByteBuffer.getInt();
        this.AEs = paramByteBuffer.getInt();
        this.AEt = paramByteBuffer.getInt();
        this.AEu = paramByteBuffer.getInt();
        this.AEp = paramByteBuffer.getInt();
      case 2:
      }
      for (this.AEv = paramByteBuffer.getInt(); ; this.AEv = paramByteBuffer.getLong())
      {
        return;
        this.AEo = paramByteBuffer.getInt();
        this.AEp = paramByteBuffer.getInt();
        this.AEq = paramByteBuffer.getLong();
        this.AEr = paramByteBuffer.getLong();
        this.AEs = paramByteBuffer.getLong();
        this.AEt = paramByteBuffer.getLong();
        this.AEu = paramByteBuffer.getLong();
      }
    }
  }

  public static class SectionHeader
  {
    public final long AEA;
    public final long AEB;
    public final int AEC;
    public final int AED;
    public final long AEE;
    public final long AEF;
    public String AEG;
    public final int AEw;
    public final int AEx;
    public final long AEy;
    public final long AEz;

    private SectionHeader(ByteBuffer paramByteBuffer, int paramInt)
    {
      switch (paramInt)
      {
      default:
        throw new IOException("Unexpected elf class: ".concat(String.valueOf(paramInt)));
      case 1:
        this.AEw = paramByteBuffer.getInt();
        this.AEx = paramByteBuffer.getInt();
        this.AEy = paramByteBuffer.getInt();
        this.AEz = paramByteBuffer.getInt();
        this.AEA = paramByteBuffer.getInt();
        this.AEB = paramByteBuffer.getInt();
        this.AEC = paramByteBuffer.getInt();
        this.AED = paramByteBuffer.getInt();
        this.AEE = paramByteBuffer.getInt();
      case 2:
      }
      for (this.AEF = paramByteBuffer.getInt(); ; this.AEF = paramByteBuffer.getLong())
      {
        this.AEG = null;
        return;
        this.AEw = paramByteBuffer.getInt();
        this.AEx = paramByteBuffer.getInt();
        this.AEy = paramByteBuffer.getLong();
        this.AEz = paramByteBuffer.getLong();
        this.AEA = paramByteBuffer.getLong();
        this.AEB = paramByteBuffer.getLong();
        this.AEC = paramByteBuffer.getInt();
        this.AED = paramByteBuffer.getInt();
        this.AEE = paramByteBuffer.getLong();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareElfFile
 * JD-Core Version:    0.6.2
 */