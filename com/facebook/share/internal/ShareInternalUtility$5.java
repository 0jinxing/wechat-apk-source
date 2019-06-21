package com.facebook.share.internal;

import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.internal.Utility.Mapper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareInternalUtility$5
  implements Utility.Mapper<NativeAppCallAttachmentStore.Attachment, String>
{
  public final String apply(NativeAppCallAttachmentStore.Attachment paramAttachment)
  {
    AppMethodBeat.i(97266);
    paramAttachment = paramAttachment.getAttachmentUrl();
    AppMethodBeat.o(97266);
    return paramAttachment;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.5
 * JD-Core Version:    0.6.2
 */