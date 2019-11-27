# Content Security Policy

Your server must set the `Content-Security-Policy` (CSP) header for the Attach embeds to work.

```
Content-Security-Policy: script-src https://embeds.attach.live; frame-src https://embeds.attach.live;
```

https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy/default-src
