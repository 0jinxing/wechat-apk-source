package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

class FileLruCache$1
  implements FileLruCache.StreamCloseCallback
{
  FileLruCache$1(FileLruCache paramFileLruCache, long paramLong, File paramFile, String paramString)
  {
  }

  public void onClose()
  {
    AppMethodBeat.i(72323);
    if (this.val$bufferFileCreateTime < FileLruCache.access$000(this.this$0).get())
    {
      this.val$buffer.delete();
      AppMethodBeat.o(72323);
    }
    while (true)
    {
      return;
      FileLruCache.access$100(this.this$0, this.val$key, this.val$buffer);
      AppMethodBeat.o(72323);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache.1
 * JD-Core Version:    0.6.2
 */