/**
 * @description Set a single property from code.
 *
 * Example:
 * key = 'error-reporting'
 * value = 'true'
 **/
export const setProperty => (key, value) = window.attachEmbeds.setProperty(key, value)

/**
 * @description Set multiple properties from code.
 * The map contains key-value pairs.
 *
 * Example:
 * {
 *   "error-reporting": "true",
 *   "project:identity-color": "#FFFF00"
 * }
 **/
export const setProperties => (map) = window.attachEmbeds.setProperties(map)
