package com.tencent.qqmusic.mediaplayer.upstream;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DefaultFileDataSourceFactory
  implements IDataSourceFactory
{
  private final String filePath;

  public DefaultFileDataSourceFactory(String paramString)
  {
    this.filePath = paramString;
  }

  public IDataSource createDataSource()
  {
    AppMethodBeat.i(128353);
    if (TextUtils.isEmpty(this.filePath))
    {
      localObject = new DataSourceException(-5, "filePath is empty!", null);
      AppMethodBeat.o(128353);
      throw ((Throwable)localObject);
    }
    Object localObject = new FileDataSource(this.filePath);
    AppMethodBeat.o(128353);
    return localObject;
  }

  public INativeDataSource createNativeDataSource()
  {
    AppMethodBeat.i(128354);
    INativeDataSource localINativeDataSource = NativeDataSourceFactory.fileDataSource(this.filePath, 0);
    AppMethodBeat.o(128354);
    return localINativeDataSource;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.DefaultFileDataSourceFactory
 * JD-Core Version:    0.6.2
 */