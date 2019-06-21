package com.tencent.mm.vfs;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.StatFs;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import com.tencent.e.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class FileBasedFileSystem extends AbstractFileSystem
{
  final boolean mReadOnly;
  private final String zYG;
  private final boolean zYH;
  private volatile String zYI;
  private volatile long zYJ = 512L;

  protected FileBasedFileSystem(Parcel paramParcel)
  {
    j.a(paramParcel, getClass());
    String str1 = paramParcel.readString();
    String str2 = str1;
    if (str1 == null)
      str2 = "";
    this.zYG = str2;
    boolean bool;
    if (paramParcel.readByte() != 0)
    {
      bool = true;
      this.mReadOnly = bool;
      if (!this.zYG.isEmpty())
        break label84;
      this.zYI = this.zYG;
      this.zYH = true;
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label84: paramParcel = j.H(this.zYG, Collections.unmodifiableMap(FileSystemManager.dMv().zZa));
      if (paramParcel != null)
      {
        asW(paramParcel);
        this.zYH = true;
      }
      else
      {
        this.zYI = null;
        this.zYH = false;
      }
    }
  }

  protected FileBasedFileSystem(String paramString)
  {
    this.zYG = paramString;
    this.mReadOnly = false;
    if (this.zYG.isEmpty())
    {
      this.zYI = this.zYG;
      this.zYH = true;
    }
    while (true)
    {
      return;
      paramString = j.H(this.zYG, Collections.unmodifiableMap(FileSystemManager.dMv().zZa));
      if (paramString != null)
      {
        asW(paramString);
        this.zYH = true;
      }
      else
      {
        this.zYI = null;
        this.zYH = false;
      }
    }
  }

  private List<FileSystem.a> a(File paramFile, ArrayList<FileSystem.a> paramArrayList)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null)
    {
      paramFile = null;
      return paramFile;
    }
    int i = arrayOfFile.length;
    for (int j = 0; ; j++)
    {
      paramFile = paramArrayList;
      if (j >= i)
        break;
      File localFile = arrayOfFile[j];
      paramFile = ad(localFile);
      if (paramFile != null)
      {
        paramArrayList.add(paramFile);
        if (paramFile.zYN)
          a(localFile, paramArrayList);
      }
    }
  }

  private FileSystem.a ad(File paramFile)
  {
    String str1 = this.zYI;
    String str2;
    if (paramFile.getPath().length() == str1.length())
    {
      str1 = "";
      str2 = paramFile.getName();
      if (Build.VERSION.SDK_INT < 21)
        break label66;
      paramFile = a.a(paramFile, this, str1, str2);
    }
    while (true)
    {
      return paramFile;
      int i = str1.length();
      str1 = paramFile.getPath().substring(i + 1);
      break;
      label66: if (!paramFile.exists())
      {
        paramFile = null;
      }
      else
      {
        boolean bool = paramFile.isDirectory();
        long l1 = paramFile.length();
        long l2 = this.zYJ;
        paramFile = new FileSystem.a(this, str1, str2, l1, (this.zYJ - 1L ^ 0xFFFFFFFF) & l2 + l1 - 1L, paramFile.lastModified(), bool);
      }
    }
  }

  private void asW(String paramString)
  {
    Object localObject = new File(paramString);
    try
    {
      paramString = ((File)localObject).getCanonicalFile();
      if (!paramString.isDirectory())
      {
        if (paramString.exists())
        {
          b.e("VFS.FileBasedFileSystem", "Base directory exists but is not a directory, delete and proceed.Base path: " + paramString.getPath());
          paramString.delete();
        }
        if (!paramString.mkdirs())
          b.e("VFS.FileBasedFileSystem", "Base directory cannot be created. Base path: " + paramString.getPath());
      }
    }
    catch (IOException paramString)
    {
      try
      {
        localObject = new android/os/StatFs;
        ((StatFs)localObject).<init>(paramString.getPath());
        int i = ((StatFs)localObject).getBlockSize();
        if ((i - 1 & i) == 0);
        for (this.zYJ = i; ; this.zYJ = 4096L)
        {
          this.zYI = paramString.getPath();
          b.i("VFS.FileBasedFileSystem", "Real path resolved: " + this.zYG + " => " + this.zYI);
          return;
          paramString = paramString;
          paramString = ((File)localObject).getAbsoluteFile();
          break;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("Non-power-of-two block size: ");
          b.w("VFS.FileBasedFileSystem", i + ", use default: 4096");
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          b.b("VFS.FileBasedFileSystem", localException, "Failed to retrieve block size.");
          this.zYJ = 4096L;
        }
      }
    }
  }

  private static boolean d(File paramFile, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      int j = 0;
      bool1 = bool2;
      if (j < i)
      {
        File localFile = arrayOfFile[j];
        if (localFile.isDirectory())
          bool2 &= d(localFile, false);
        while (true)
        {
          j++;
          break;
          bool2 &= localFile.delete();
        }
      }
    }
    bool2 = bool1;
    if (!paramBoolean)
      bool2 = bool1 & paramFile.delete();
    return bool2;
  }

  public final List<FileSystem.a> M(String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    paramString = new File(O(paramString, false));
    if (!paramString.isDirectory())
      paramString = localObject;
    while (true)
    {
      return paramString;
      ArrayList localArrayList = new ArrayList();
      if (paramBoolean)
      {
        paramString = a(paramString, localArrayList);
      }
      else
      {
        File[] arrayOfFile = paramString.listFiles();
        paramString = localObject;
        if (arrayOfFile != null)
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
          {
            paramString = ad(arrayOfFile[j]);
            if (paramString != null)
              localArrayList.add(paramString);
          }
          paramString = localArrayList;
        }
      }
    }
  }

  public final boolean N(String paramString, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2;
    if ((paramString.isEmpty()) || (paramString.equals("/")))
    {
      bool2 = true;
      paramString = new File(O(paramString, false));
      if (paramString.isDirectory())
        break label52;
      paramBoolean = bool1;
    }
    while (true)
    {
      return paramBoolean;
      bool2 = false;
      break;
      label52: if (paramBoolean)
        paramBoolean = d(paramString, bool2);
      else
        paramBoolean = paramString.delete();
    }
  }

  public final String O(String paramString, boolean paramBoolean)
  {
    String str = this.zYI;
    if (str == null)
      throw new IllegalStateException("Base path cannot be resolved: " + this.zYG);
    if (paramString.isEmpty());
    for (paramString = str; ; paramString = str + '/' + paramString)
      return paramString;
  }

  public final boolean aS(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    paramString1 = O(paramString1, false);
    paramString2 = O(paramString2, true);
    boolean bool2 = bool1;
    if (paramString1 != null)
      if (paramString2 != null)
        break label33;
    label33: for (bool2 = bool1; ; bool2 = new File(paramString1).renameTo(new File(paramString2)))
      return bool2;
  }

  public int aiR()
  {
    int i = 56;
    if (!this.mReadOnly)
      i = 57;
    return i;
  }

  public final String dMt()
  {
    String str1 = this.zYI;
    String str2 = str1;
    if (str1 == null)
      str2 = this.zYG;
    return str2;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean exists(String paramString)
  {
    boolean bool1 = false;
    paramString = O(paramString, false);
    boolean bool2 = bool1;
    if (paramString != null)
    {
      bool2 = bool1;
      if (new File(paramString).exists())
        bool2 = true;
    }
    return bool2;
  }

  public void p(Map<String, String> paramMap)
  {
    if (!this.zYH)
    {
      String str = this.zYI;
      paramMap = j.H(this.zYG, paramMap);
      if ((paramMap == null) || (paramMap.equals(str)))
        break label39;
      asW(paramMap);
    }
    while (true)
    {
      return;
      label39: this.zYI = paramMap;
    }
  }

  public final boolean pI(String paramString)
  {
    boolean bool = false;
    paramString = O(paramString, false);
    if (paramString == null);
    while (true)
    {
      return bool;
      bool = new File(paramString).delete();
    }
  }

  public final boolean t(String paramString, long paramLong)
  {
    return new File(O(paramString, true)).setLastModified(paramLong);
  }

  public final boolean tf(String paramString)
  {
    paramString = O(paramString, true);
    if (paramString == null);
    for (boolean bool = false; ; bool = new File(paramString).mkdirs())
      return bool;
  }

  public final FileSystem.b tn(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    try
    {
      localStatFs = new android/os/StatFs;
      localStatFs.<init>(O(str, false));
      paramString = new FileSystem.b();
      if (Build.VERSION.SDK_INT >= 18)
      {
        paramString.xBy = localStatFs.getBlockSizeLong();
        paramString.xBx = localStatFs.getAvailableBlocksLong();
        paramString.xBv = localStatFs.getBlockCountLong();
        paramString.zYP = (paramString.xBx * paramString.xBy);
        paramString.zYQ = (paramString.xBv * paramString.xBy);
        return paramString;
      }
    }
    catch (RuntimeException paramString)
    {
      while (true)
      {
        StatFs localStatFs;
        paramString = null;
        continue;
        paramString.xBy = localStatFs.getBlockSize();
        paramString.xBx = localStatFs.getAvailableBlocks();
        paramString.xBv = localStatFs.getBlockCount();
      }
    }
  }

  public final FileSystem.a to(String paramString)
  {
    return ad(new File(O(paramString, false)));
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    paramParcel.writeInt(1);
    paramParcel.writeString(this.zYG);
    if (this.mReadOnly);
    while (true)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
      paramInt = 0;
    }
  }

  @TargetApi(21)
  static final class a
  {
    static FileSystem.a a(File paramFile, FileSystem paramFileSystem, String paramString1, String paramString2)
    {
      AppMethodBeat.i(54503);
      try
      {
        StructStat localStructStat = Os.stat(paramFile.getPath());
        if (localStructStat == null)
        {
          paramFile = null;
          AppMethodBeat.o(54503);
        }
        while (true)
        {
          return paramFile;
          boolean bool = OsConstants.S_ISDIR(localStructStat.st_mode);
          paramFile = new com/tencent/mm/vfs/FileSystem$a;
          paramFile.<init>(paramFileSystem, paramString1, paramString2, localStructStat.st_size, localStructStat.st_blocks * 512L, 1000L * localStructStat.st_mtime, bool);
          AppMethodBeat.o(54503);
        }
      }
      catch (ErrnoException paramFile)
      {
        while (true)
        {
          paramFile = null;
          AppMethodBeat.o(54503);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.FileBasedFileSystem
 * JD-Core Version:    0.6.2
 */