package com.tencent.mm.vfs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Collections;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

public class RC4EncryptedFileSystem extends FileBasedFileSystem
{
  public static final Parcelable.Creator<RC4EncryptedFileSystem> CREATOR;
  private final String eIq;
  private final FileSystemManager.b zZG;
  private final boolean zZH;
  private volatile Key zZI;

  static
  {
    AppMethodBeat.i(54578);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(54578);
  }

  private RC4EncryptedFileSystem(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(54572);
    j.a(paramParcel, getClass());
    this.zZG = FileSystemManager.dMw();
    this.eIq = paramParcel.readString();
    if (this.zZG == null)
    {
      paramParcel = new RuntimeException("Set global generator by calling setGlobalKeyGenerator(...) before initializing FileSystem objects.");
      AppMethodBeat.o(54572);
      throw paramParcel;
    }
    this.zZI = this.zZG.e(this.eIq, Collections.unmodifiableMap(FileSystemManager.dMv().zZa));
    if (this.zZI != null);
    for (boolean bool = true; ; bool = false)
    {
      this.zZH = bool;
      AppMethodBeat.o(54572);
      return;
    }
  }

  public RC4EncryptedFileSystem(String paramString1, String paramString2)
  {
    super(paramString1);
    AppMethodBeat.i(54571);
    this.zZG = FileSystemManager.dMw();
    this.eIq = paramString2;
    if (this.zZG == null)
    {
      paramString1 = new RuntimeException("Set global generator by calling setKeyGenerator(...) before initializing FileSystem objects.");
      AppMethodBeat.o(54571);
      throw paramString1;
    }
    this.zZI = this.zZG.e(this.eIq, Collections.unmodifiableMap(FileSystemManager.dMv().zZa));
    if (this.zZI != null);
    for (boolean bool = true; ; bool = false)
    {
      this.zZH = bool;
      AppMethodBeat.o(54571);
      return;
    }
  }

  public final OutputStream L(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54574);
    Object localObject = this.zZI;
    if (localObject == null)
    {
      paramString = new IOException("Key is not initialized.");
      AppMethodBeat.o(54574);
      throw paramString;
    }
    if (this.mReadOnly)
    {
      paramString = new IOException("Cannot open files for writing on read-only file systems");
      AppMethodBeat.o(54574);
      throw paramString;
    }
    String str = O(paramString, true);
    if (str == null)
    {
      paramString = new IOException("Invalid path: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(54574);
      throw paramString;
    }
    try
    {
      paramString = Cipher.getInstance("RC4");
      paramString.init(1, (Key)localObject);
      localObject = new java/io/FileOutputStream;
      ((FileOutputStream)localObject).<init>(str, paramBoolean);
      paramString = new CipherOutputStream((OutputStream)localObject, paramString);
      AppMethodBeat.o(54574);
      return paramString;
    }
    catch (GeneralSecurityException paramString)
    {
      paramString = (FileNotFoundException)new FileNotFoundException("Failed to initialize cipher: " + paramString.getMessage()).initCause(paramString);
      AppMethodBeat.o(54574);
    }
    throw paramString;
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(54573);
    Object localObject = this.zZI;
    if (localObject == null)
    {
      paramString = new IOException("Key is not initialized.");
      AppMethodBeat.o(54573);
      throw paramString;
    }
    String str = O(paramString, false);
    if (str == null)
    {
      paramString = new IOException("Invalid path: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(54573);
      throw paramString;
    }
    try
    {
      paramString = Cipher.getInstance("RC4");
      paramString.init(2, (Key)localObject);
      localObject = new java/io/FileInputStream;
      ((FileInputStream)localObject).<init>(str);
      paramString = new CipherInputStream((InputStream)localObject, paramString);
      AppMethodBeat.o(54573);
      return paramString;
    }
    catch (GeneralSecurityException paramString)
    {
      paramString = (FileNotFoundException)new FileNotFoundException("Failed to initialize cipher: " + paramString.getMessage()).initCause(paramString);
      AppMethodBeat.o(54573);
    }
    throw paramString;
  }

  public final void p(Map<String, String> paramMap)
  {
    AppMethodBeat.i(54575);
    super.p(paramMap);
    if (!this.zZH)
      this.zZI = this.zZG.e(this.eIq, paramMap);
    AppMethodBeat.o(54575);
  }

  public String toString()
  {
    AppMethodBeat.i(54576);
    Object localObject = new StringBuilder("RC4FS [").append(dMt());
    if (this.mReadOnly)
      ((StringBuilder)localObject).append(", read-only");
    localObject = ']';
    AppMethodBeat.o(54576);
    return localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(54577);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(1);
    paramParcel.writeString(this.eIq);
    AppMethodBeat.o(54577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.RC4EncryptedFileSystem
 * JD-Core Version:    0.6.2
 */