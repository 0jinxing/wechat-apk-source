package com.tencent.mm.modelsfs;

import android.os.CancellationSignal;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.FileSystem;
import com.tencent.mm.vfs.FileSystem.a;
import com.tencent.mm.vfs.FileSystem.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SFSFileSystem
  implements FileSystem
{
  public static final Parcelable.Creator<SFSFileSystem> CREATOR;
  private SFSContext fOk;
  private final SFSContext.Builder fOl;

  static
  {
    AppMethodBeat.i(93254);
    CREATOR = new SFSFileSystem.1();
    AppMethodBeat.o(93254);
  }

  private SFSFileSystem(Parcel paramParcel)
  {
    AppMethodBeat.i(93242);
    this.fOl = ((SFSContext.Builder)paramParcel.readParcelable(SFSContext.class.getClassLoader()));
    AppMethodBeat.o(93242);
  }

  private FileSystem.a a(SFSContext.FileEntry paramFileEntry)
  {
    AppMethodBeat.i(93248);
    paramFileEntry = new FileSystem.a(this, paramFileEntry.name, paramFileEntry.name.substring(paramFileEntry.name.lastIndexOf('/') + 1), paramFileEntry.size, paramFileEntry.size + 4095L & 0xFFFFF000, paramFileEntry.timestamp, false);
    AppMethodBeat.o(93248);
    return paramFileEntry;
  }

  private void aiQ()
  {
    AppMethodBeat.i(93243);
    if (this.fOk == null)
      this.fOk = this.fOl.create();
    AppMethodBeat.o(93243);
  }

  public final OutputStream L(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93246);
    aiQ();
    paramString = this.fOk.pH(paramString);
    AppMethodBeat.o(93246);
    return paramString;
  }

  public final List<FileSystem.a> M(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93251);
    aiQ();
    try
    {
      Object localObject = this.fOk.tl(paramString);
      paramString = new java/util/ArrayList;
      paramString.<init>(((List)localObject).size());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramString.add(a((SFSContext.FileEntry)((Iterator)localObject).next()));
    }
    catch (IOException paramString)
    {
      paramString = null;
      AppMethodBeat.o(93251);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(93251);
    }
  }

  public final boolean N(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93252);
    aiQ();
    try
    {
      paramString = this.fOk.tl(paramString).iterator();
      while (paramString.hasNext())
      {
        SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)paramString.next();
        this.fOk.pI(localFileEntry.name);
      }
    }
    catch (IOException paramString)
    {
      paramBoolean = false;
      AppMethodBeat.o(93252);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = true;
      AppMethodBeat.o(93252);
    }
  }

  public final String O(String paramString, boolean paramBoolean)
  {
    return null;
  }

  public final void a(CancellationSignal paramCancellationSignal)
  {
  }

  public final boolean aS(String paramString1, String paramString2)
  {
    return false;
  }

  public final int aiR()
  {
    return 9;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean exists(String paramString)
  {
    AppMethodBeat.i(93247);
    aiQ();
    boolean bool = this.fOk.exists(paramString);
    AppMethodBeat.o(93247);
    return bool;
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(93245);
    aiQ();
    paramString = this.fOk.openRead(paramString);
    AppMethodBeat.o(93245);
    return paramString;
  }

  public final void p(Map<String, String> paramMap)
  {
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(93250);
    aiQ();
    boolean bool = this.fOk.pI(paramString);
    AppMethodBeat.o(93250);
    return bool;
  }

  public final boolean t(String paramString, long paramLong)
  {
    return false;
  }

  public final boolean tf(String paramString)
  {
    return true;
  }

  public final FileSystem.b tn(String paramString)
  {
    AppMethodBeat.i(93244);
    paramString = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
    FileSystem.b localb = new FileSystem.b();
    localb.xBy = paramString.getBlockSize();
    localb.xBx = paramString.getAvailableBlocks();
    localb.xBv = paramString.getBlockCount();
    localb.zYP = (localb.xBx * localb.xBy);
    localb.zYQ = (localb.xBv * localb.xBy);
    AppMethodBeat.o(93244);
    return localb;
  }

  public final FileSystem.a to(String paramString)
  {
    AppMethodBeat.i(93249);
    aiQ();
    paramString = this.fOk.tm(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(93249);
    }
    while (true)
    {
      return paramString;
      paramString = a(paramString);
      AppMethodBeat.o(93249);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(93253);
    paramParcel.writeParcelable(this.fOl, paramInt);
    AppMethodBeat.o(93253);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.SFSFileSystem
 * JD-Core Version:    0.6.2
 */