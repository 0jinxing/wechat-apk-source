package com.google.android.exoplayer2.source.b;

import android.net.Uri;
import com.google.android.exoplayer2.h.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.crypto.CipherInputStream;

final class a
  implements f
{
  private final byte[] aTc;
  private final f bik;
  private final byte[] bil;
  private CipherInputStream bim;

  public a(f paramf, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.bik = paramf;
    this.aTc = paramArrayOfByte1;
    this.bil = paramArrayOfByte2;
  }

  // ERROR //
  public final long a(com.google.android.exoplayer2.h.i parami)
  {
    // Byte code:
    //   0: ldc 36
    //   2: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 44
    //   7: invokestatic 50	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   10: astore_2
    //   11: new 52	javax/crypto/spec/SecretKeySpec
    //   14: dup
    //   15: aload_0
    //   16: getfield 22	com/google/android/exoplayer2/source/b/a:aTc	[B
    //   19: ldc 54
    //   21: invokespecial 57	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   24: astore_3
    //   25: new 59	javax/crypto/spec/IvParameterSpec
    //   28: dup
    //   29: aload_0
    //   30: getfield 24	com/google/android/exoplayer2/source/b/a:bil	[B
    //   33: invokespecial 62	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   36: astore 4
    //   38: aload_2
    //   39: iconst_2
    //   40: aload_3
    //   41: aload 4
    //   43: invokevirtual 66	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   46: aload_0
    //   47: new 68	javax/crypto/CipherInputStream
    //   50: dup
    //   51: new 70	com/google/android/exoplayer2/h/h
    //   54: dup
    //   55: aload_0
    //   56: getfield 20	com/google/android/exoplayer2/source/b/a:bik	Lcom/google/android/exoplayer2/h/f;
    //   59: aload_1
    //   60: invokespecial 73	com/google/android/exoplayer2/h/h:<init>	(Lcom/google/android/exoplayer2/h/f;Lcom/google/android/exoplayer2/h/i;)V
    //   63: aload_2
    //   64: invokespecial 76	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    //   67: putfield 78	com/google/android/exoplayer2/source/b/a:bim	Ljavax/crypto/CipherInputStream;
    //   70: ldc 36
    //   72: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: ldc2_w 82
    //   78: lreturn
    //   79: astore_1
    //   80: new 85	java/lang/RuntimeException
    //   83: dup
    //   84: aload_1
    //   85: invokespecial 88	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   88: astore_1
    //   89: ldc 36
    //   91: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_1
    //   95: athrow
    //   96: astore_1
    //   97: new 85	java/lang/RuntimeException
    //   100: dup
    //   101: aload_1
    //   102: invokespecial 88	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   105: astore_1
    //   106: ldc 36
    //   108: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_1
    //   112: athrow
    //   113: astore_1
    //   114: goto -17 -> 97
    //   117: astore_1
    //   118: goto -38 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   5	11	79	java/security/NoSuchAlgorithmException
    //   38	46	96	java/security/InvalidKeyException
    //   38	46	113	java/security/InvalidAlgorithmParameterException
    //   5	11	117	javax/crypto/NoSuchPaddingException
  }

  public final void close()
  {
    AppMethodBeat.i(125895);
    this.bim = null;
    this.bik.close();
    AppMethodBeat.o(125895);
  }

  public final Uri getUri()
  {
    AppMethodBeat.i(125897);
    Uri localUri = this.bik.getUri();
    AppMethodBeat.o(125897);
    return localUri;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(125896);
    boolean bool;
    if (this.bim != null)
    {
      bool = true;
      com.google.android.exoplayer2.i.a.checkState(bool);
      paramInt1 = this.bim.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 >= 0)
        break label50;
      paramInt1 = -1;
      AppMethodBeat.o(125896);
    }
    while (true)
    {
      return paramInt1;
      bool = false;
      break;
      label50: AppMethodBeat.o(125896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.a
 * JD-Core Version:    0.6.2
 */